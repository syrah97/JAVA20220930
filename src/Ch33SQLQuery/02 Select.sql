select * from buytbl;

-- ������ �� ���� ���� 
select userid,sum(amount) as �ѱ��ż��� from buytbl group by userid;
select userid,avg(amount) as �ѱ��ż��� from buytbl group by userid;

select userid,avg(amount) as �ѱ��ż��� from buytbl group by userid;
select userid, cast(avg(amount) as decimal(10,3)) as �ѱ��ż��� from buytbl group by userid;
select userid, trunc(avg(amount) ,3) as �ѱ��ż��� from buytbl group by userid;

select max(height) from usertbl;
select min(height) from usertbl;
select max(birthyear) from usertbl;
select min(birthyear) from usertbl;

-- MAX,MIN +������ ���������� �̿��� ����
-- usertbl���� ����Ű�� ū���� ��� ���� ���
select * from usertbl where height = (select max(height) from usertbl);
-- buytbl���� ���ŷ��� ���� ū ���� ��� ���� ���
select * from buytbl where amount=(select max(amount) from buytbl);

select userid, max(amount), min(amount) from buytbl group by userid;

select *  from usertbl;

select count(*) from usertbl;
select count(mobile1) from usertbl;

select avg(amount) from buytbl;
select cast(avg(amount) as decimal(5,3)) from buytbl;
select trunc(avg(amount),3) from buytbl;

-- ----------------------
select userid,sum(amount) from buytbl group by userid;
select avg(height) from usertbl;
select userid,max(amount),min(amount) from buytbl group by userid;

select  count(distinct groupname) from buytbl;


select userid,sum(amount) from buytbl group by userid;
select userid,sum(amount) from buytbl group by userid where sum(amount) >=5;
select userid,sum(amount) from buytbl group by userid having sum(amount) >=5;
select userid,sum(amount) as ���ż��� from buytbl group by userid having sum(amount) >=5;

select userid, sum(amount*price) from buytbl group by userid having sum(amount*price)>=100;
select userid, sum(amount*price) from buytbl group by userid having sum(amount*price)>=100
order by sum(amount*price) asc;

select prodname,sum(price*amount) from buytbl group by prodname;
select prodname,sum(price*amount) from buytbl group by prodname having sum(price*amount)>=1000;

select distinct userid,prodname,price from buytbl 
where 
price=(select max(price) from buytbl)
or 
price=(select min(price) from buytbl);

-- ���հ�
select groupname,sum(price*amount) from buytbl group by rollup(groupname);

select num,groupname, sum(price*amount) from buytbl group by rollup(groupname,num);
select prodname,groupname, sum(price*amount) from buytbl group by rollup(groupname,prodname);

select * from buytbl;











