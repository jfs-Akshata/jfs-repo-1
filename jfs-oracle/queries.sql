--QUERIES--
select department_name from departments;
select * from departments;
SELECT department_id, location_id
FROM departments;
SELECT last_name, salary, salary + 300
FROM employees;
select * from dual;
select 2 * 5 + 10 from dual;
select 2 * (5 + 10) from dual;
SELECT last_name, job_id, salary, commission_pct
FROM employees;
select 2 * 5 + null from dual;
SELECT last_name, salary, COMMISSION_PCT, 12*salary*commission_pct
FROM employees;
SELECT last_name AS name, commission_pct commission
FROM employees;
SELECT last_name AS name, commission_pct "commission"
FROM employees;
SELECT last_name AS name, commission_pct as "comission"
FROM employees;
select last_name || ' > ' || first_name from employees;
select 'welcome to oracle sql' from dual;

select q'[welcome to oracle's sql]' from dual;
SELECT distinct department_id
FROM employees;
select department_id from employees;
desc employees;