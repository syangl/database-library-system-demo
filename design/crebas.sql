/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2022/4/14 21:32:33                           */
/*==============================================================*/


drop table if exists 借阅记录;

drop table if exists 图书;

drop table if exists 管理员;

drop table if exists 罚款记录;

drop table if exists 读者;

drop table if exists 账号;

/*==============================================================*/
/* Table: 借阅记录                                                  */
/*==============================================================*/
create table 借阅记录
(
   借阅数量                 int,
   借出日期                 char(12),
   归还期限                 char(12),
   借阅记录ID               int not null,
   图书ID                 int not null,
   账户ID                 int not null,
   primary key (借阅记录ID)
);

/*==============================================================*/
/* Table: 图书                                                    */
/*==============================================================*/
create table 图书
(
   图书ID                 int not null,
   作者                   char(30),
   价格                   float,
   出版社                  char(30),
   库存数量                 int,
   primary key (图书ID)
);

/*==============================================================*/
/* Table: 管理员                                                   */
/*==============================================================*/
create table 管理员
(
   账户ID                 int not null,
   管理员名                 char(10),
   管理员密码                char(10),
   primary key (账户ID)
);

/*==============================================================*/
/* Table: 罚款记录                                                  */
/*==============================================================*/
create table 罚款记录
(
   未还数量                 int,
   罚款金额                 float,
   罚款记录ID               int not null,
   图书ID                 int not null,
   账户ID                 int not null,
   超时时长                 char(10),
   primary key (罚款记录ID)
);

/*==============================================================*/
/* Table: 读者                                                    */
/*==============================================================*/
create table 读者
(
   账户ID                 int not null,
   读者密码                 char(10),
   读者名                  char(10),
   primary key (账户ID)
);

/*==============================================================*/
/* Table: 账号                                                    */
/*==============================================================*/
create table 账号
(
   账户ID                 int not null,
   身份                   char(4),
   primary key (账户ID)
);

alter table 借阅记录 add constraint FK_借阅 foreign key (账户ID)
      references 读者 (账户ID);

alter table 借阅记录 add constraint FK_借阅对象 foreign key (图书ID)
      references 图书 (图书ID);

alter table 管理员 add constraint FK_isa2 foreign key (账户ID)
      references 账号 (账户ID);

alter table 罚款记录 add constraint FK_未还书籍 foreign key (图书ID)
      references 图书 (图书ID);

alter table 罚款记录 add constraint FK_罚款 foreign key (账户ID)
      references 读者 (账户ID);

alter table 读者 add constraint FK_isa foreign key (账户ID)
      references 账号 (账户ID);

