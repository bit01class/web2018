drop table user05;
drop sequence user05_seq;

create table user05(
	num number primary key,
	id varchar2(10),
	pw varchar2(10)
);

create sequence user05_seq;

insert into user05 values (user05_seq.nextval, 'user1','1234');
insert into user05 values (user05_seq.nextval, 'user2','1234');
insert into user05 values (user05_seq.nextval, 'user3','1234');
insert into user05 values (user05_seq.nextval, 'user4','1234');

commit;