commit;
-- �ǽ��� ���̺� ����
CREATE TABLE TEST(
NO NUMBER(3),
NAME VARCHAR2(10),
AGE NUMBER(3),
GENDER VARCHAR2(6)
);
-- ������ �߰�
INSERT INTO TEST VALUES(1, 'JOKER', '28', 'M');
-- ������ �߰�
INSERT INTO TEST VALUES(2, 'ADAMS', '33', 'M');
select * from test;
--���̺�����Ʈ S1 ����
savepoint s1;
-- ������ �߰�
INSERT INTO TEST VALUES(3, 'SMITH', '35', 'M');
--���̺�����Ʈ S2 ����
savepoint s2;
commit;
INSERT INTO TEST VALUES(4, 'MARRY', '40', 'W');
INSERT INTO TEST VALUES(5, 'KIM', '45', 'M');
select * from test;

rollback to s2;
select * from test;
rollback to s1;
select * from test;
rollback;
select * from test;



