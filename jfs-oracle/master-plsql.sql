--anonymous block
begin
DBMS_OUTPUT.PUT_LINE('Welcome to the world of PL/SQL Programming!');
end;

set serveroutput on;
--declaring variables
declare
--MyName char(20);
Myname VARCHAR2(20) DEFAULT 'John';
MyAddress char(20) := 'Mars';
begin
--MyName := 'Rambo';
DBMS_OUTPUT.PUT_LINE('My Name is : ' || MyName);
DBMS_OUTPUT.PUT_LINE('My Address : ' || MyAddress);
end;
-- compilation error
begin
select * from employees;
end;

-- using sql statement inside a plsql block
select * from countries;

-- runtime error
--"no data found"
-- "exact fetch returns more than requested number of rows"
declare
country_name char(20);
begin
select country_name into country_name from countries;
--select country_name into country_name from countries where country_id ='ZMb';
--select country_name into country_name from countries where country_id ='ZM'; 
DBMS_OUTPUT.PUT_LINE('Country Name : ' || country_name);
end;

--The %TYPE Attribute
desc employees;
declare
country_name countries.country_name%TYPE;
begin
select country_name into country_name from countries where country_id ='ZM'; 
DBMS_OUTPUT.PUT_LINE('Country Name : ' || country_name);
end;

--bind variables
--declare
variable countrynamebindvariable char(20)
begin
select country_name into :countrynamebindvariable from countries where country_id ='ZM'; 
--DBMS_OUTPUT.PUT_LINE('Country Name : ' || country_name);
end;
print countrynamebindvariable;
set autoprint on;

--Substitution Variables
variable countrynamebindvariable char(20)
begin
select country_name into :countrynamebindvariable from countries where country_id =&CountryID; 
--DBMS_OUTPUT.PUT_LINE('Country Name : ' || country_name);
end;
print countrynamebindvariable;
set autoprint on;

--selecting multiple columns
declare
country_namevar char(20);
region_idvar number;
begin
select country_name, region_id into country_namevar, region_idvar from countries
where country_id ='ZM';
DBMS_OUTPUT.PUT_LINE('Country Name : ' || country_namevar);
DBMS_OUTPUT.PUT_LINE('Region Id : ' || region_idvar);
end;

-- using aggregate functions in pl/sql
declare
noOfCountries number;
begin
select count(*) into noOfCountries from countries;
DBMS_OUTPUT.PUT_LINE('Count of Countries : ' || noOfCountries);
end;

--DML
--insert
select sysdate from dual;
BEGIN
INSERT INTO employees
(employee_id, first_name, last_name, email,
hire_date, job_id, salary)
VALUES(207, 'Ruth', 'Cores',
'RCORES',sysdate, 'AD_ASST', 4000);
END;
/
select job_id, salary from employees
WHERE job_id = 'ST_CLERK';

DECLARE
sal_increase employees.salary%TYPE := 800;
BEGIN
UPDATE employees
SET salary = salary + sal_increase
WHERE job_id = 'ST_CLERK';
END;
/

begin
delete from employees where employee_id = 207;
end;
--merge command
DECLARE
empno employees.employee_id%TYPE := 100;
BEGIN
MERGE INTO hr.copy_emp c
USING hr.employees e
ON (e.employee_id = c.employee_id)
WHEN MATCHED THEN
UPDATE SET
c.first_name = e.first_name,
c.last_name = e.last_name,
c.email = e.email,
c.HIRE_DATE = e.HIRE_DATE,
c.JOB_ID = e.JOB_ID
WHEN NOT MATCHED THEN
INSERT VALUES(e.employee_id, e.first_name, e.last_name,e.EMAIL, e.PHONE_NUMBER, e.HIRE_DATE, e.JOB_ID ,e.salary, e.commission_pct, e.department_id);
END;
/

create table copy_emp( 
EMPLOYEE_ID    NUMBER(6) NOT NULL ,    
FIRST_NAME              VARCHAR2(20), 
LAST_NAME    VARCHAR2(25)   NOT NULL , 
EMAIL         VARCHAR2(25)   NOT NULL, 
PHONE_NUMBER            VARCHAR2(20), 
HIRE_DATE      DATE   NOT NULL,        
JOB_ID        VARCHAR2(10)  NOT NULL , 
SALARY          NUMBER(8,2),  
COMMISSION_PCT       NUMBER(6),    
DEPARTMENT_ID           NUMBER(4) 
)
--CURSORS
SELECT * FROM T1;
DELETE FROM T1
WHERE f1 = 'a';

--implicit cursor
begin
DELETE FROM T1;
--WHERE f1 = 'a';
DBMS_OUTPUT.PUT_LINE('No of rows deleted : ' || SQL%ROWCOUNT);
end;

DECLARE
myage number:=31;
BEGIN
IF myage < 11
THEN
DBMS_OUTPUT.PUT_LINE(' I am a child ');
ELSIF myage < 20
THEN
DBMS_OUTPUT.PUT_LINE(' I am young ');
ELSIF myage < 30
THEN
DBMS_OUTPUT.PUT_LINE(' I am in my twenties');
ELSIF myage < 40
THEN
DBMS_OUTPUT.PUT_LINE(' I am in my thirties');
ELSE
DBMS_OUTPUT.PUT_LINE(' I am always young ');
END IF;
END;
/

DECLARE
myage number;
BEGIN
IF myage < 11
THEN
DBMS_OUTPUT.PUT_LINE(' I am a child ');
ELSE
DBMS_OUTPUT.PUT_LINE(' I am not a child ');
END IF;
END;
/

--record type
DECLARE
TYPE emp_record_type IS RECORD
(last_name VARCHAR2(25),
job_id VARCHAR2(10),
salary NUMBER(8,2));
emp_record emp_record_type;
BEGIN
SELECT last_name, job_id,salary INTO emp_record FROM EMPLOYEES where employee_id = 100;
DBMS_OUTPUT.PUT_LINE(emp_record.job_id);
DBMS_OUTPUT.PUT_LINE(emp_record.salary);
DBMS_OUTPUT.PUT_LINE(emp_record.last_name);
END;

--row type
DECLARE
emp_record employees%ROWTYPE;
BEGIN
SELECT * INTO emp_record FROM EMPLOYEES where employee_id = 100;
DBMS_OUTPUT.PUT_LINE(emp_record.first_name);
DBMS_OUTPUT.PUT_LINE(emp_record.job_id);
DBMS_OUTPUT.PUT_LINE(emp_record.salary);
DBMS_OUTPUT.PUT_LINE(emp_record.last_name);
END;
 
----------------EXPLICIT CURSORS-----------------    

declare
--declare a cursor
cursor employeeCursor is
select first_name, last_name from employees;
firstname employees.first_name%TYPE;
lastname employees.last_name%TYPE;
begin
-- open the cursor
open employeeCursor;
--fetch 
loop
fetch employeeCursor into firstname, lastname;
DBMS_OUTPUT.PUT_LINE( firstname ||' '||lastname);
exit when employeeCursor%NOTFOUND;
end loop;
--close
close employeeCursor;
end;


--use cursor for loops

declare
--declare a cursor
cursor employeeCursor is
select first_name, last_name, employee_id from employees;
begin
for emp_record in employeeCursor
loop 
DBMS_OUTPUT.PUT_LINE( emp_record.first_name ||' '||emp_record.last_name ||' '|| emp_record.employee_id);
exit when employeeCursor%NOTFOUND;
end loop;
end;

--Cursors with Parameters
declare
--declare a cursor
cursor employeeCursor(job_id char(20)) is
select first_name, last_name from employees where job_id = job_id;
firstname employees.first_name%TYPE;
lastname employees.last_name%TYPE;
begin
-- open the cursor
open employeeCursor('AD_VP');
--fetch 
loop
fetch employeeCursor into firstname, lastname;
DBMS_OUTPUT.PUT_LINE( firstname ||' '||lastname);
exit when employeeCursor%NOTFOUND;
end loop;
--close
close employeeCursor;
end;

--CURSOR WITH PARAMETERS--------
declare
--declare a cursor
cursor employeeCursor(job_id char) is
select first_name, last_name, EMPLOYEE_ID from employees where job_id = job_id;
begin
for emp_record in employeeCursor('AD_VP')
loop 
DBMS_OUTPUT.PUT_LINE( emp_record.first_name ||' '||emp_record.last_name ||' '|| emp_record.employee_id);
exit when employeeCursor%NOTFOUND;
end loop;
end;

-----HANDLING EXCEPTIONS
DECLARE
lname VARCHAR2(15);
BEGIN
SELECT last_name INTO lname FROM employees WHERE first_name='John';
DBMS_OUTPUT.PUT_LINE ('John''s last name is : '
||lname);
EXCEPTION
WHEN TOO_MANY_ROWS THEN
DBMS_OUTPUT.PUT_LINE (' Your select statement retrieved multiple rows. Consider using a cursor.');
END;


--NAMED PL/SQL BLOCKS
create procedure myproc as
dept_id dept.department_id%TYPE;
dept_name dept.department_name%TYPE;
begin
dept_id:=280;
dept_name:='ST-Curriculum';
INSERT INTO dept(department_id,department_name)
VALUES(dept_id,dept_name);
DBMS_OUTPUT.PUT_LINE(' Inserted '||
SQL%ROWCOUNT ||' row ');
end;

begin
myproc;
end;

-------FUNCTIONS--------------
CREATE or replace function myfunc 
return number
is
begin
return 100;
end;


select myfunc() from dual;

CREATE or replace function adder (value1 number, value2 number)
return number
is
begin
return value1 + value2;
end;

select adder(5,6) from dual;
select department_id, adder(department_id, 100) from departments;