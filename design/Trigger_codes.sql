use library;

delimiter //
CREATE TRIGGER LoginTrig
BEFORE INSERT ON 读者 
FOR EACH ROW 
BEGIN
	IF (new.账户ID NOT IN (SELECT 账户ID FROM 账号)) THEN
		INSERT INTO 账号(账户ID,身份) VALUES(new.账户ID,'读者');
	END IF;
END; //
delimiter ;

delimiter //
CREATE TRIGGER LoginTrigMana
BEFORE INSERT ON 管理员 
FOR EACH ROW 
BEGIN
	IF (new.账户ID NOT IN (SELECT 账户ID FROM 账号)) THEN
		INSERT INTO 账号(账户ID,身份) VALUES(new.账户ID,'管理员');
	END IF;
END; //
delimiter ;


DROP PROCEDURE IF EXISTS num_update ;
delimiter //
CREATE PROCEDURE num_update(IN add_num INT, IN ID INT, IN option_type INT)
BEGIN
	CASE 
		WHEN option_type = 1 THEN 
			update 图书 set 库存数量 = 库存数量 + add_num where 图书ID = ID;
		WHEN option_type = 2  THEN
			update 借阅记录 set 借阅数量 = 借阅数量 + add_num where 借阅记录ID = ID;
		ELSE 
			update 罚款记录 set 未还数量 = 未还数量 + add_num where 罚款记录ID = ID;
    END CASE;
END //
delimiter ;

CREATE VIEW multi_lookup AS 
select 借阅记录ID, 借阅数量, 借出日期, 归还期限, 图书ID, 账户ID, 出版社 
from 借阅记录 natural join 图书 


