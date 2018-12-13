
create table emp01(
	sabun number primary key,
	name varchar(15),
	nalja date,
	pay number
);

create sequence emp01_seq; 

-- dummy data
insert into emp01 values (emp01_seq.nextval,'user01',sysdate,1000);
insert into emp01 values (emp01_seq.nextval,'user02',sysdate,2000);
commit;

select * from emp01;
