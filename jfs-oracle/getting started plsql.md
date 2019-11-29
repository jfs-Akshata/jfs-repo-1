-- Breaking the ice
PL/SQL
======
SQL = querying capabilities 
? programming capabilities
sql + procedures (logic) : PL/SQL.
## Procedural languages : c, c++
# Example: auto generation of orders : O0001 O0002 O0003
# Front End : 
> jdbc ... get max orderid
> O0003 : 3>4, "O000" + "4"
> O0009 : 9>10, "O00"+10 = "O0010"
? Logic on java, connect to db, get the highest order id, increment using java logic, connect to db, insert record into database.

# Alternative
Stored procedure in the backend >
> from front end : details, orderdate, address.... (not enter orderid)
> procedure generates order id in the backend.
# advantages
1. procedures are precompiled
2. execute faster
3. reduces the burden on the front end devloper.
4. auditing purposes.

# SUMMARY : pl/sql for logic , sql for queries

# pl sql code
# template
declare
MyName char(20);
begin
DBMS_OUTPUT.PUT_LINE('' || MyName);
end;