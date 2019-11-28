# select rows from a database table
Front End : Java (Relational)
Back End : MySQL (OOPS)
Java : SQL (Driver)
Driver : software component that enables connectivity between java and db.
Java SQLServer, MySQL, Oracle.
java + mysql (mysql)

# setup mysql
1. mysql service should be running
2. use mysql workbench
3. root mysql
4. create schema

# driver for mysql
1. get the jar (java archive) .jar https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.18
    add the jar to the classpath
2. identify the driver class : com.mysql.jdbc.Driver
3. load the driver : Class.forName("com.mysql.jdbc.Driver")
4. get the details of server
    server ip (localhost), port(3306), database (jfsdb) where the server is running, user id (root) , password (mysql).
5. create the connection string "protocol:subprotocol//server:port/database"
    jdbc:mysql//localhost:3306/jfsdb
6. Get the connection DriverManager.getConnection("connectionString", "userid","password")
7. Create the query  
8. Execute the query
9. Display the results.

# code in a nutshell
1. Load the driver
2. Get the connection
3. Create the query
4. Execute the query
5. Display the results
6. Close the connection



    

