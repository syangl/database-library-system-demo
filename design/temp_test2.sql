use library;

-- insert into 读者(账户ID, 读者密码, 读者名) values (20220001, 123456, 'Reader');
-- insert into 管理员(账户ID, 管理员密码, 管理员名) values (220002, 123456, '管理员乙');
-- select * from 账号;
-- update 读者 set 读者名 = '读者甲' where 账户ID = 20220001 and 读者名 = 'Reader';
-- insert into 图书(图书ID, 作者, 价格, 出版社, 库存数量) values(1,'小明',20,'某出版社',1);

-- start transaction;
-- 	delete from 管理员 where 账户ID = '20220003';
-- 	delete from 账号 where 账户ID = '20220003';
-- commit;-- rollback;
-- start transaction;
-- delete from 借阅记录 where 借阅记录.图书ID = 3;
-- delete from 罚款记录 where 罚款记录.图书ID = 3;
-- delete from 图书 where 图书ID = 3;
-- commit;

select * from 账号;
select * from 读者;
select * from 管理员;
select * from 图书;
select * from 借阅记录;
select * from 罚款记录;
select * from multi_lookup;