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
