


-- Ŀ��
-- Ŀ���� ���� price*amount�� 500������ groupname�� prodname�� 
-- tmp3_tbl(prodname,groupname)�� �����ϼ���
-- Ŀ���� : CUR_02
-- tmp3_tbl�� ���� buytbl�� prodname,groupname�� ���̺� ����� ó���մϴ�(������ ����)

drop table tmp3_tbl;
create table tmp3_tbl as select prodname,groupname from buytbl where 1=2;
select * from tmp3_tbl;
desc tmp3_tbl;

declare 
    price buytbl.price%TYPE;
    amount buytbl.amount%TYPE;
    prodname buytbl.prodname%TYPE;
    groupname buytbl.groupname%TYPE;
    CURSOR CUR_02
    IS
    select 
    price,amount,prodname,groupname
    from 
    buytbl;
begin
 open CUR_02;   -- Ŀ������
 Loop
    Fetch CUR_02 into price,amount,prodname,groupname;   -- Ŀ������ ������ ��������
    exit when CUR_02 %NOTFOUND; --Ŀ���� ���� ��� ����
    if price*amount<=500 then
        insert into tmp3_tbl values(prodname,groupname);
    end if;
 end Loop;
 CLOSE CUR_02;  --Ŀ���ݱ�
end;


-- ���ν���
SET serveroutput ON;

drop procedure Proc01;
create or replace PROCEDURE Proc01
IS
    START_MESSAGE VARCHAR2(100) := '------test_START----------';
    END_MESSAGE VARCHAR2(100) := '-------test_END------------';
BEGIN
    DBMS_OUTPUT.PUT_LINE(START_MESSAGE);
    DBMS_OUTPUT.PUT_LINE(END_MESSAGE);
END;

exec Proc01;

-- --------------------------------------
drop procedure Proc02;
create or replace PROCEDURE Proc02 
IS
    score number := 90;
    var1 varchar2(10);
    START_MESSAGE VARCHAR2(100) := '------test_START----------';
    END_MESSAGE VARCHAR2(100) := '-------test_END------------';
BEGIN
    DBMS_OUTPUT.PUT_LINE(START_MESSAGE);
    IF (score>=90) then
       var1 :='A';
    Elsif (score>=80) Then
       var1 :='B';
    Elsif (score>=70) Then
        var1 :='C';
    Elsif (score>=60) Then   
        var1 :='D';
    else
       var1 :='E';
    END IF;
    DBMS_OUTPUT.PUT_LINE(var1);
    DBMS_OUTPUT.PUT_LINE(END_MESSAGE);
END;

exec Proc02 ;


drop procedure Proc03;
create or replace PROCEDURE Proc03 
IS
    NUM1 NUMBER :=1;
BEGIN
    WHILE(NUM1<10) --NUM�� 10���� ���������� LOOP����
    LOOP
    DBMS_OUTPUT.PUT_LINE(NUM1); --���
    NUM1 := NUM1+1; --NUM = NUM +1
    END LOOP;

END;

exec Proc03;

create or replace procedure Proc04
(
    s IN number,
    e IN number
)
IS
    num1 number := s;
BEGIN
   
    WHILE(num1<=e) --NUM�� 10���� ���������� LOOP����
    LOOP
    DBMS_OUTPUT.PUT_LINE(num1); --���
    num1 := num1+1;  
    END LOOP;
END;

exec Proc04(5,10);
exec Proc04(7,20);

-- �ܺηκ��� �����ܼ��� �Է¹޾� �ܼ���ŭ�� ������ ���
-- ���ν����� : googoodan(dan IN number)

create or replace procedure googoodan
(
   dan IN number
)
IS
    i number := 1;
BEGIN
   
    WHILE(i<=9) --NUM�� 10���� ���������� LOOP����
    LOOP
    DBMS_OUTPUT.PUT_LINE(dan || ' x ' || i || ' = ' || (dan*i) ); --���
    i := i+1;  
    END LOOP;
END;
exec googoodan(5);

-- --------------------------------
drop procedure Proc07;
create or replace procedure Proc07
(
    s IN number,
    e IN number,
    r OUT number
)
IS
    i number :=s;
    s1 number :=0;
BEGIN   
    WHILE(i<=e) --NUM�� 10���� ���������� LOOP����
    LOOP
        DBMS_OUTPUT.PUT_LINE(i); --���
        s1:=s1 + i;
        i := i + 1;  
    END LOOP;
    
    r := s1;
    commit;
END;

declare
    r number;
begin
     proc07(1,10,r);
end;

-- Ȯ�� 
declare
    r number;
begin
    Proc07(1,10,r);
    DBMS_OUTPUT.PUT_LINE('��� : ' || r);
end;
-- --------------------------------------------
create or replace procedure Proc05
(
    num in number,
    div in number
)
IS 
BEGIN
    
    DBMS_OUTPUT.PUT_LINE(num/div);
    EXCEPTION 
        WHEN ZERO_DIVIDE THEN 
            DBMS_OUTPUT.PUT_LINE('0���� ���� �� �����ϴ�. �⺻�� 0���� ġȯ �մϴ�.');
END;    

exec Proc05(10,4);
exec Proc05(10,0);

select * from usertbl;

create table backup_user as select * from usertbl where 1=2;
select * from backup_user;
alter table backup_user add type varchar(10) not null;
alter table backup_user add moddate date not null;
select * from backup_user;

create or replace trigger trg_01
after
update
on usertbl
for each row
begin
    insert into backup_user values(:old.userid,:old.name,:old.birthyear,
        :old.addr,:old.mobile1,:old.mobile2, :old.height, :old.mdate, '����', SYSDATE);
end;

select * from usertbl;
update usertbl set addr='�뱸' where userid='LJB';
select * from backup_user;

create or replace trigger trg_02
after
delete
on usertbl
for each row
begin
    insert into backup_user values(:old.userid,:old.name,:old.birthyear,
        :old.addr,:old.mobile1,:old.mobile2, :old.height, :old.mdate, '����', SYSDATE);
end;


select * from usertbl;
delete from usertbl where userid='EJW';
select * from backup_user;


create or replace trigger trg_03
before
insert
on usertbl
for each row
begin
    insert into backup_user values(:new.userid,:new.name,:new.birthyear,
        :new.addr,:new.mobile1,:new.mobile2, :new.height, :new.mdate, '�߰�', SYSDATE);
end;

select * from usertbl;
insert into usertbl values('aaa','����',1999,'�뱸','010','0111111',177,SYSDATE);
select * from backup_user;

-- on update cascad

drop table usertbl;
drop table buytbl;


-- --------------------------------------------
-- UserTbl �����
CREATE TABLE userTbl( -- ȸ�����̺�
userID CHAR(8) NOT NULL PRIMARY KEY, -- ����ھ��̵�
name VARCHAR(10) NOT NULL, -- �̸�
birthYear INT NOT NULL, -- ����⵵
addr NCHAR(2) NOT NULL, --����(2���ڸ� �Է�, �泲,����,���..)
mobile1 CHAR(3), -- �޴����� ����(011,016...)
mobile2 CHAR(8), -- �޴����� ������ ��ȭ��ȣ
height SMALLINT, -- Ű
mDate DATE --ȸ��������
);

-- Buytbl �����
CREATE TABLE buyTbl( -- ȸ�� ���� ���̺�
num INT NOT NULL PRIMARY KEY, -- ����(PK) 
userID CHAR(8) NOT NULL, --
prodName CHAR(15) NOT NULL, -- ��ǰ��
groupName CHAR(15), -- �з�
price INT NOT NULL, -- �ܰ�
amount SMALLINT NOT NULL, -- ����
FOREIGN KEY (userID) REFERENCES userTbl(userID)
);

-- Usertbl ������
INSERT INTO userTbl VALUES('LSG','�̽±�',1987,'����','011','1111111',182,'2008-8-8');
INSERT INTO userTbl VALUES('KBS','�����',1979,'�泲','011','2222222',173,'2012-4-4');
INSERT INTO userTbl VALUES('KKH','���ȣ',1971,'����','019','3333333',177,'2007-7-7');
INSERT INTO userTbl VALUES('JYP','������',1950,'���','011','4444444',166,'2009-4-4');
INSERT INTO userTbl VALUES('SSK','���ð�',1979,'����',NULL,NULL,186,'2013-12-12');
INSERT INTO userTbl VALUES('LJB','�����',1963,'����','016','6666666',182,'2009-9-9');
INSERT INTO userTbl VALUES('YJS','������',1969,'�泲',NULL,NULL,170,'2005-5-5');
INSERT INTO userTbl VALUES('EJW','������',1972,'���','011','8888888',174,'2014-3-3');
INSERT INTO userTbl VALUES('JKW','������',1965,'���','018','9999999',172,'2010-10-10');
INSERT INTO userTbl VALUES('BBK','�ٺ�Ŵ',1973,'����','010','0000000',176,'2013-5-5');

select * from usertbl;

-- Buytbl �� ����

INSERT INTO buyTbl VALUES(1,'KBS','�ȭ',NULL,30,2);
INSERT INTO buyTbl VALUES(2,'KBS','��Ʈ��','����',1000,1);
INSERT INTO buyTbl VALUES(3,'JYP','�����','����',200,1);
INSERT INTO buyTbl VALUES(4,'BBK','�����','����',200,5);
INSERT INTO buyTbl VALUES(5,'KBS','û����','�Ƿ�',50,3);
INSERT INTO buyTbl VALUES(6,'BBK','�޸�','����',80,10);
INSERT INTO buyTbl VALUES(7,'SSK','å','����',15,5);
INSERT INTO buyTbl VALUES(8,'EJW','å','����',15,2);
INSERT INTO buyTbl VALUES(9,'EJW','û����','�Ƿ�',50,1);
INSERT INTO buyTbl VALUES(10,'BBK','�ȭ',NULL,30,2);
INSERT INTO buyTbl VALUES(11,'EJW','å','����',15,1);
INSERT INTO buyTbl VALUES(12,'BBK','�ȭ',NULL,30,2);



select * from usertbl;
select * from buytbl;
delete from usertbl where userid='KBS';


create or replace trigger on_Update_trg
after
update or delete
on usertbl
for each row
begin
    update buytbl set userid=:new.userid where userid=:old.userid;
end;

select * from usertbl;
select * from buytbl;
update usertbl set userid='AAA' where userid='KBS';



-- Ʈ����

-- ����

-- OracleDB + JDBC �����ϱ�

-- SQLD ������ or ����Ʈ���� ����!!

