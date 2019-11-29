--joins
drop table t1;
drop table t2;
create table t1(f1 char(5), f2 char(5), f3 char(5));
create table t2(f1 char(5), f2 char(5), f4 char(5));
insert into t1 values('a','b','ab');
insert into t1 values('a1','b1','a1b1');
insert into t1 values('a2','b2','a2b2');
insert into t1 values('a3','b3','a3b3');

insert into t2 values('a','b','x1');
insert into t2 values('a1','b1','x2');
insert into t2 values('b2','b2','x3');
insert into t2 values('a3','c3','x4');

select * from t1;
select * from t2;

--natural join
select * from t1
natural join t2;
select f1,f2,f3 from t1
natural join t2;

--cross join
select * from t1
cross join t2;
select * from t1, t2;

--inner join
select  * from t1
inner join t2
on t1.f1 = t2.f1;

--left outer join
select  * from t1
left outer join t2
on t1.f1 = t2.f1;

select * from t1, t2
where t1.f1 = t2.f2(+);

--right outer
select  * from t1
right outer join t2
on t1.f1 = t2.f1;

select  * from t1, t2
where t1.f1(+) = t2.f1;

--full outer join
select  * from t1
full outer join t2
on t1.f1 = t2.f1;

-- equi 
select  * from t1
inner join t2
on t1.f1 = t2.f1;

-- non equi join
select  * from t1
inner join t2
on t1.f1 != t2.f1;

select * from employees;
--self-join
select e.first_name || ' works for ' || m.first_name  from
employees e join employees m
on e.manager_id = m.employee_id;