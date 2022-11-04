---- -------------------------
---- DDL
---- -------------------------
---- 1) ���̺� �߰�
--create table tmp_tbl(
-- col1 int primary key,
-- col2 int,
-- col3 int
--);
--select * from tmp_tbl;
--desc tmp_tbl;
--
---- 2) ���߰�
--alter table tmp_tbl add (col4 int);
--desc tmp_tbl;
---- 3) ������(�ڷ���)
--alter table tmp_tbl modify(col1 varchar(10));
--desc tmp_tbl;
---- 4) ������(�̸�����)
--alter table tmp_tbl rename column col1 to column1;
--desc tmp_tbl;
---- 5) ������
--alter table tmp_tbl drop column col2;
--desc tmp_tbl;
--
---- ---------------------------------------------
---- UserTbl �����
--CREATE TABLE userTbl( -- ȸ�����̺�
--userID CHAR(8) NOT NULL PRIMARY KEY, -- ����ھ��̵�
--name VARCHAR(10) NOT NULL, -- �̸�
--birthYear INT NOT NULL, -- ����⵵
--addr NCHAR(2) NOT NULL, --����(2���ڸ� �Է�, �泲,����,���..)
--mobile1 CHAR(3), -- �޴����� ����(011,016...)
--mobile2 CHAR(8), -- �޴����� ������ ��ȭ��ȣ
--height SMALLINT, -- Ű
--mDate DATE --ȸ��������
--);
--
---- Buytbl �����
--CREATE TABLE buyTbl( -- ȸ�� ���� ���̺�
--num INT NOT NULL PRIMARY KEY, -- ����(PK) 
--userID CHAR(8) NOT NULL, --
--prodName CHAR(15) NOT NULL, -- ��ǰ��
--groupName CHAR(15), -- �з�
--price INT NOT NULL, -- �ܰ�
--amount SMALLINT NOT NULL, -- ����
--FOREIGN KEY (userID) REFERENCES userTbl(userID)
--);
--
---- Usertbl ������
--INSERT INTO userTbl VALUES('LSG','�̽±�',1987,'����','011','1111111',182,'2008-8-8');
--INSERT INTO userTbl VALUES('KBS','�����',1979,'�泲','011','2222222',173,'2012-4-4');
--INSERT INTO userTbl VALUES('KKH','���ȣ',1971,'����','019','3333333',177,'2007-7-7');
--INSERT INTO userTbl VALUES('JYP','������',1950,'���','011','4444444',166,'2009-4-4');
--INSERT INTO userTbl VALUES('SSK','���ð�',1979,'����',NULL,NULL,186,'2013-12-12');
--INSERT INTO userTbl VALUES('LJB','�����',1963,'����','016','6666666',182,'2009-9-9');
--INSERT INTO userTbl VALUES('YJS','������',1969,'�泲',NULL,NULL,170,'2005-5-5');
--INSERT INTO userTbl VALUES('EJW','������',1972,'���','011','8888888',174,'2014-3-3');
--INSERT INTO userTbl VALUES('JKW','������',1965,'���','018','9999999',172,'2010-10-10');
--INSERT INTO userTbl VALUES('BBK','�ٺ�Ŵ',1973,'����','010','0000000',176,'2013-5-5');
--
--select * from usertbl;
--
---- Buytbl �� ����
--
--INSERT INTO buyTbl VALUES(1,'KBS','�ȭ',NULL,30,2);
--INSERT INTO buyTbl VALUES(2,'KBS','��Ʈ��','����',1000,1);
--INSERT INTO buyTbl VALUES(3,'JYP','�����','����',200,1);
--INSERT INTO buyTbl VALUES(4,'BBK','�����','����',200,5);
--INSERT INTO buyTbl VALUES(5,'KBS','û����','�Ƿ�',50,3);
--INSERT INTO buyTbl VALUES(6,'BBK','�޸�','����',80,10);
--INSERT INTO buyTbl VALUES(7,'SSK','å','����',15,5);
--INSERT INTO buyTbl VALUES(8,'EJW','å','����',15,2);
--INSERT INTO buyTbl VALUES(9,'EJW','û����','�Ƿ�',50,1);
--INSERT INTO buyTbl VALUES(10,'BBK','�ȭ',NULL,30,2);
--INSERT INTO buyTbl VALUES(11,'EJW','å','����',15,1);
--INSERT INTO buyTbl VALUES(12,'BBK','�ȭ',NULL,30,2);
--
--
--select * from buytbl;
--select * from usertbl;
---- --------------------------------------------
--select * from usertbl;
--select * from usertbl where name='���ȣ';
--
--select * from usertbl where birthyear >= 1970 and height>=180;
--select * from usertbl where birthyear between 1970 and 1980;
--select * from usertbl where birthyear >=1970 and birthyear <=1980;
--select * from usertbl where birthyear >= 1970 or height>=180;
--
--select name,height,addr from usertbl where addr in ('�泲','����','���');
--
--select * from usertbl where name like '��%';
--select * from usertbl where name like '%��';
--select * from usertbl where name like '��__';
--select * from usertbl where name like '%��%';
--
--
---- ����
--select * from tbl_pump;
--
--select * from buytbl where amount>=5;
--
--select * from buytbl where price between 50 and 500;
--select * from buytbl where price >= 50 and price <=500;
--select * from buytbl where amount >=10 or price >=100;
--select * from buytbl where userid like 'K%';
--select * from buytbl where groupname in ('����','����');
--select * from buytbl where prodname='å' or userid like '%W';
--select * from tbl_pump where �����������ּ� like '%�Ű%';
--

-- ���ȣ ���� ū Ű��� ��� ���
select * from usertbl where height>=(select height from usertbl where name='���ȣ') and name <> '���ȣ';
-- ��������� ���̰� ���� ����� ���
select * from usertbl where birthyear>(select birthyear from usertbl where name='�����');

-- �泲 ������ Ű���� ū ���� ���
select * from usertbl where height> any(select height from usertbl where addr='�泲');
select * from usertbl where height> all(select height from usertbl where addr='�泲');


--����
select * from buytbl where price>(select price from buytbl where amount=10);
select * from buytbl where amount> any(select amount from buytbl where userid like 'K%');
select * from buytbl where price >(select price from buytbl where amount=5);


select * from usertbl order by mdate;
select * from usertbl order by mdate desc;
select * from usertbl order by birthyear asc, name desc;

select distinct addr from usertbl order by addr;

select *  from (select rownum as RN, usertbl.* from usertbl) where RN>=2 and RN<=4;

-- ���̺� ���� + ������
create table buytbl2 as select * from buytbl;
select * from buytbl2;
desc buytbl2;

-- ������
create table buytbl3 as select * from buytbl where 1=2;
select * from buytbl3;
desc buytbl3;

insert into buytbl3 select * from buytbl;
select * from buytbl3;


-- ����
select * from buytbl order by userid;
select * from buytbl order by price desc;
select * from buytbl order by amount asc,prodname desc;
select distinct prodname from buytbl order by prodname;
select distinct userid from buytbl;
select * from buytbl where amount>=3 order by prodname desc;

create table cusertbl as select * from usertbl where addr in ('����','���');

select * from cusertbl;
















