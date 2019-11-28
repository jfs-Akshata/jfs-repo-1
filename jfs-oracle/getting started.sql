-- select all columns
select * from countries;
-- describe the table
desc employees;
-- selecting specific columns
select first_name, last_name from employees;
-- order by
select first_name, last_name from employees
order by first_name;
-- aritmetic operation
select salary from employees;
select salary, salary+1000 from employees;
-- user defined column heading
select salary, salary+1000 as "Calculated Salary" from employees;
-- string concatenation
select first_name || ' earns ' || salary from employees;
select first_name || ' earns ' || salary as "Employee Salary Report" from employees;
--filter rows
select first_name, salary from employees where salary >= 17000;
select * from employees where first_name like 'S%';
select * from employees where first_name like 'S%' or first_name like 'T%';
select * from employees where COMMISSION_PCT = 'null';
select first_name, commission_pct from employees where COMMISSION_PCT is null;
select first_name, commission_pct from employees where not COMMISSION_PCT is null;
select first_name, commission_pct from employees where  COMMISSION_PCT is not null;
select count(*) from employees;
----------------------------------------