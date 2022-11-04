--select * from usertbl;
--select * from buytbl;
--
--select *
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--select name,mobile1,mobile2,prodname,groupname,amount
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--
--select usertbl.userid, name,mobile1,mobile2,prodname,groupname,amount
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--select U.userid, U.name,U.mobile1,U.mobile2,B.prodname,B.groupname,amount
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid;
--
--select U.userid, U.name,U.mobile1,U.mobile2,B.prodname,B.groupname,amount
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid
--where amount>=5
--order by U.name;
--
---- �ٺ�Ŵ�� userid,birthyear,prodname,groupname�� ����ϼ���
--
--select U.userid,birthyear,prodname,groupname
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid
--where U.name='�ٺ�Ŵ';
--
--select concat(mobile1,mobile2) from usertbl;
--select mobile1 ||'-'|| mobile2 from usertbl;
--
--
---- amount*price ���� 100�̻��� ���� name,addr,prodname,mobile1-mobile2 �� ����ϼ���
---- ( concat()�Լ�����غ��ϴ� - ����Ŭ concatã�ƺ���)
--select name,addr,prodname, 
--case  when mobile1 is not null then mobile1 ||'-'||mobile2 end case 
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid;
--
---- groupname�� ������ ���� userid,name,birthyear,prodname�� ����ϼ���
--select usertbl.userid,name,birthyear,prodname 
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid
--where groupname='����';
--
--
--select * 
--from usertbl U
--left outer join buytbl B
--on U.userid=B.userid;
--
--
--select * 
--from buytbl B
--right outer join usertbl U
--on U.userid=B.userid;
--
--alter table buytbl drop constraint SYS_C007009;
--commit;


-- ���Ƹ� �ڵ� �������� 
-- [�л�Tbl]

drop table stdTbl;
drop table clubTbl;
drop table stdclubTbl;
commit;


CREATE TABLE stdTbl(
	stdName CHAR(10) NOT NULL PRIMARY KEY,
	addr CHAR(10) NOT NULL
);
-- [���Ƹ�Tbl]
CREATE TABLE clubTbl(
	clubName CHAR(10) NOT NULL PRIMARY KEY,
	roomNo CHAR(10) NOT NULL
);
-- [�л����Ƹ�Tbl]
CREATE TABLE stdclubTbl(
	num INT PRIMARY KEY,
	stdName CHAR(10) NOT NULL,
	clubName CHAR(10) NOT NULL,
    FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
	FOREIGN KEY(clubName)REFERENCES clubTbl(clubname)
);
INSERT INTO stdTbl VALUES('�����','�泲');
INSERT INTO stdTbl values('���ð�','����');
INSERT INTO stdTbl values('������','���');
INSERT INTO stdTbl values('������','���');
INSERT INTO stdTbl values('�ٺ�Ŵ','����');

INSERT INTO clubTbl VALUES('����','101ȣ');
INSERT INTO clubTbl VALUES('�ٵ�','102ȣ');
INSERT INTO clubTbl VALUES('�౸','103ȣ');
INSERT INTO clubTbl VALUES('����','104ȣ');

INSERT INTO stdclubTbl VALUES(1,'�����','�ٵ�');
INSERT INTO stdclubTbl VALUES(2,'�����','�౸');
INSERT INTO stdclubTbl VALUES(3,'������','�౸');
INSERT INTO stdclubTbl VALUES(4,'������','�౸');
INSERT INTO stdclubTbl VALUES(5,'������','����');
INSERT INTO stdclubTbl VALUES(6,'�ٺ�Ŵ','����');

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;


select * 
from stdtbl S
inner join stdclubtbl SC
on S.stdname=SC.stdname
inner join clubtbl C
on SC.clubname = C.clubname;


select * 
from stdtbl S
left outer join stdclubtbl SC
on S.stdname=SC.stdname
left outer join clubtbl C
on SC.clubname = C.clubname;

select * 
from stdtbl S
right outer join stdclubtbl SC
on S.stdname=SC.stdname
right outer join clubtbl C
on SC.clubname = C.clubname;

-- full outer join 

select * 
from stdtbl S
full outer join stdclubtbl SC
on S.stdname=SC.stdname
full outer join clubtbl C
on SC.clubname = C.clubname;


-- stdname clubname,roomno,addr �� ����մϴ�
-- inner join �� ����մϴ�.
create table tmp_01 as
select U.userid,name,birthyear,prodname,groupname,price,amount 
from usertbl U,buytbl B;

select * from tMp_01;

select * 
from usertbl U1,usertbl U2;


drop table emptbl;
create table emptbl(emp char(15), manager char(15), empTel varchar(15));
insert into emptbl values('������',null,'0000');
insert into emptbl values('�繫����','������','1111');
insert into emptbl values('�����','�繫����','2222');
insert into emptbl values('�̺���','�繫����','3333');
insert into emptbl values('�̴븮','�����','4444');
insert into emptbl values('���븮','�̺���','5555');
insert into emptbl values('�����','�̺���','6666');
insert into emptbl values('�����','�����','7777');


select * from emptbl;
-- ���� ������ ���ӻ���� ����ó(Self Join)
select E1.emp as ������ , E1.manager ���ӻ�� ,E2.emptel ���ӻ��Tel
from emptbl E1 join emptbl E2
on E1.manager=E2.emp;

-- ---------------------------------------------------------------------

-- Equi Join ( = �� ����ϴ� join)
select *
from usertbl U , buytbl B
where U.userid=B.userid;

select * 
from usertbl U
inner join buytbl B
on U.userid=B.userid;

-- Non-Equi Join( =  �̿��� �����ڸ� ����ϴ� join)
select *
from usertbl U ,buytbl B
where U.userid=B.userid and B.amount >= 4;

-- Natural Join
--�������̸��� ���� �÷��� ��� ���ε�
select * from usertbl natural join buytbl; 

-- using
-- ������ �̸��� ���� �÷��� ���ε�
select * from usertbl join buytbl using (userid);

-- -------------------------------------------------------------------
[INNER JOIN]

select ���̸� 
from ���̺�A
inner join ���̺�B
on ������

[LEFT OUTER JOIN]

select ���̸� 
from ���̺�A
left outer join ���̺�B
on ������

[RIGHT OUTER JOIN]
select ���̸� 
from ���̺�A
right outer join ���̺�B
on ������

[FULL OUTER JOIN]

select ���̸� 
from ���̺�A
full outer join ���̺�B
on ������

[CROSS JOIN]

select * 
from ���̺�A ,���̺�B;

[SELF JOIN]

select ���̸�
from ���̺�A E1 join ���̺�B E2
on ������;



-- ----------------
EQUI JOIN
NON-EQUI JOIN

NATURIAL JOIN

select * 
from stdtbl 
natural join stdclubtbl 
natural join clubtbl
where stdname='�����';


USING JOIN
-- stdtbl, stdclubtbl, clubtbl;
select * 
from stdtbl 
join stdclubtbl using (stdname)
join clubtbl using(clubname);

-- -------------------------------------------------------------------------------
select * from usertbl;
select * from buytbl;

create or replace view view_01
as
select U.userid,name,birthyear,prodname,groupname,price,amount 
from usertbl U
inner join buytbl B
on U.userid=B.userid;

select * from view_01;

drop table a_tbl;
drop table b_tbl;

create table a_tbl
(
    col1 int primary key,
    col2 int,
    col3 int not null,
    col4 int
);

drop view View_03;

create or replace view  view_01
as
select col1,col3 from a_tbl;

select * from view_01;

insert into view_01 values(10,20);
insert into view_01 values(30,40);
select * from view_01;
select * from a_tbl;


create or replace view  view_02
as
select col2,col4 from a_tbl;

insert into view_02 values(11,21);
insert into view_02 values(31,41);

create or replace view  view_01
as
select col1,col3 from a_tbl
with read only;

insert into view_01 values(7,8);
-- -----------------------------------------------------------------
SET serveroutput ON;

BEGIN
    dbms_output.put_line('HELLO WORLD');
END;

declare
    var1 int:=10;
    var2 int:=20;
BEGIN
    dbms_output.put_line('�� : ' || (var1+var2));
END;

select * from buytbl;
desc buytbl;

declare
    var1 buytbl.price%TYPE := 100;
    var2 buytbl.amount%TYPE := 200;
BEGIN
    dbms_output.put_line('�� : ' || (var1));
END;

declare
    var1 buytbl.price%TYPE;
    var2 buytbl.amount%TYPE;
BEGIN
    select price,amount into var1,var2 from buytbl where price=1000;
    dbms_output.put_line('var1 : ' || var1 || ' var2 : ' || var2);
END;

select price,amount from buytbl where price=1000;


declare
    n int :=1;
BEGIN
    if n>=5 then
        dbms_output.put_line('5���� ŭ');
    elsif n>=3 then
        dbms_output.put_line('3���� ŭ');
    else
        dbms_output.put_line('3���� ����');
    end if;
END;

declare
    n int :=15;
BEGIN
    case 
    when n<10 then
        dbms_output.put_line('10���� ����');
    when n<20 then
        dbms_output.put_line('10���� ũ�� 20���ٴ� ����');
    else
        dbms_output.put_line('20���� ŭ');
    end case;
END;


select userid,price,amount,
case 
    when amount <= 1 then '�Ϲ�'
    when amount <= 5 then '���'
    when amount <=10 then 'VIP'
end case
from buytbl;


declare
    n int :=1;
begin
    while(n<10)
    loop
        dbms_output.put_line('n : ' || n);
        n:=n+1;
    end loop;
end;



begin
    for i in 1..9 
    loop
        dbms_output.put_line('i : ' || i);
    end loop;
end;

-- for, while  2 x 1 ~ 2 x 9 

begin
    for i in 1..9 
    loop
        dbms_output.put_line('2 x '|| i ||' = '||(2*i));
    end loop;
end;


-- 1 ����
declare
    i int := 100; j int := 200; hap int := 0;
    sub int := 0; mul int :=0; div int := 0;
begin
    -- i + j = hap
    -- i - j = sub
    -- i * j = mul
    -- i / j = div
    hap:=i+j;
    dbms_output.put_line(i ||' + ' || j || ' = ' || hap);
end;
-- 2 ����
drop table test_01 cascade constraints;
create table test_01 (
    no int,
    name varchar(20)
);
begin
    -- test_01 ���̺� 1���� 100���� �ݺ��Ͽ� 1 �̸����� / 2 �̸����� / 3 �̸����� ... 100 �̸����� 
    -- �� ����ɼ� �ֵ��� �غ��ϴ�.
    for i in 1..100
    loop
        insert into test_01 values(i,'�̸�����'||i);
    end loop;
end;
select * from test_01;

-- ------------------------------------------
create table tmp2_tbl as select userid,birthyear 
from usertbl where 1=2;
select * from tmp2_tbl;
desc tmp2_tbl;


declare 
    userid usertbl.userid%TYPE;
    birthyear usertbl.birthyear%TYPE;
    CURSOR CUR_01
    IS
    select 
    userid,birthyear 
    from 
    usertbl;
begin
 open CUR_01;   -- Ŀ������
 Loop
    Fetch CUR_01 into userid,birthyear;   -- Ŀ������ ������ ��������
    exit when CUR_01 %NOTFOUND; --Ŀ���� ���� ��� ����
    
    if birthyear>=1970 then
       insert into tmp2_tbl values(userid,birthyear);
    end if;
 end Loop;
 CLOSE CUR_01;  --Ŀ���ݱ�
end;

select * from tmp2_tbl;



select * from usertbl;

alter table buytbl add grade varchar(25);

select * from buytbl;

declare 
    n buytbl.num%TYPE;
    price buytbl.price%TYPE;
    amount buytbl.amount%TYPE;
    CURSOR CUR_01
    IS
    select 
    num,price,amount
    from 
    buytbl;
begin
 open CUR_01;   -- Ŀ������
 Loop
    Fetch CUR_01 into n,price,amount;   -- Ŀ������ ������ ��������
    exit when CUR_01 %NOTFOUND; --Ŀ���� ���� ��� ����
    
    if price*amount<=50 then
        dbms_output.put_line('�Ϲݰ�');
        update  buytbl set grade='�Ϲݰ�' where num=n;
    elsif price*amount<=100 then
        dbms_output.put_line('�����');
        update  buytbl set grade='�����' where num=n;
    else
        dbms_output.put_line('VIP');
         update  buytbl set grade='VIP' where num=n;
    end if;
 end Loop;
 CLOSE CUR_01;  --Ŀ���ݱ�
end;

select * from buytbl;







 
select userid,price,
case when amount<3 then 'a'
	 when amount<7 then 'b'
end case
from buytbl;
 




















