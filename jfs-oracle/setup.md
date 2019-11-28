# setup from scratch
<uninstall oracle>
<login to oracle site and download "OracleXE112_Win64" & "sqldeveloper-17.2.0.188.1159-x64" with JDK" 1.8 1.8 >
<install oralce xe, extract sql developer>
<configure hr account using "Run SQL Command Line"
command : connect sys as sysdba
password : oracle
unlock the hr account
command : alter user hr account unlock;
assingn hr user a password
alter user hr identified by hr 
disconnect from sys
command : disconnect
connect to hr
connect : connect hr/hr >

# the hr catalog is ready. TREAT THE TABLES AS READ ONLY.
SQL> select table_name from user_tables;

TABLE_NAME
------------------------------
REGIONS
LOCATIONS
DEPARTMENTS
JOBS
EMPLOYEES
JOB_HISTORY
COUNTRIES

# roadmap
Oracle SQL, Oracle PL/SQL


# coding
<run sql command line>
connect hr/hr;
disconnect;
connect sys as sysdba
connect system as sysdba
disconnect;
clear scr;

<sql developer>
create new connection
open a worksheet

# task : analyze the configuratoin of oracle in your computer and login.