drop table user03;
drop table emp03;
drop sequence user03_seq;
drop sequence emp03_seq;

create table user03(
	num number primary key,
	id varchar2(15),
	pw varchar2(15),
	name varchar2(15)
);

create sequence user03_seq;

create table emp03(
	num number primary key,
	unum number references user03(num),
	sub varchar2(30),
	content varchar2(2000),
	nalja date,
	cnt number default 0
	
);

create sequence emp03_seq;

--dummy
insert into user03 values(user03_seq.nextval,'admin','1234','관리자');
insert into user03 values(user03_seq.nextval,'root','1234','최고관리자');
insert into user03 values(user03_seq.nextval,'user01','1234','손님1');

insert into emp03 values (emp03_seq.nextval,1,'test1','test',sysdate,0);
insert into emp03 values (emp03_seq.nextval,1,'test2','test',sysdate,0);
insert into emp03 values (emp03_seq.nextval,2,'test3','test',sysdate,0);
insert into emp03 values (emp03_seq.nextval,3,'test4','test',sysdate,0);
commit;

select num,(select name from user03 where num=unum) as "name",sub,content,nalja,cnt from emp03;

















