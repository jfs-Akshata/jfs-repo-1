# CREATE A CRUD APPLICATION WITH SPRING BOOT, SPRING DATA JPA, HIBERNATE
---
## CREATING THE SPRING BOOT PROJECT
**1. create your project**
- Name : l01-springboot-springdatajpa-hibernate-oracle-crud
- Type : Maven
- Java Version : Java 8
- Group : com.demo
- Artifact : l01-springboot-springdatajpa-hibernate-oracle-crud
- Package : com.demo
- Spring Boot Version : 2.1.11
- Dependencies
  - Spring Web
  - Spring Data JPA
  
**2. Explore the pom**
``` xml
   <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.11.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.demo</groupId>
	<artifactId>l01-springboot-springdatajpa-hibernate-oracle-crud</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>l01-springboot-springdatajpa-hibernate-oracle-crud</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
```

## CONFIGURING SPRING DATA JPA WITH HIBERNATE

>* Code Reference for standard JPA Implementation*
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
                      http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
	version="2.0">
	<persistence-unit name="JPA-PU">
		<properties>
			<property name="javax.persistence.jdbc.url"
				value="jdbc:mysql://localhost:3306/jfsdb?useSSL=false" />
			<property name="javax.persistence.jdbc.user"
				value="root" />
			<property name="javax.persistence.jdbc.password"
				value="mysql" />
			<property name="javax.persistence.jdbc.driver"
				value="com.mysql.jdbc.Driver" />
<!-- 			<property name="hbm2ddl.auto" value="create"/> -->
		</properties>
	</persistence-unit>
</persistence>
```
1. Configure Spring Data JPA /5a-spring-data-jpa-hibernate-oracle-crud/src/main/resources/application.properties
``` properties
## use create when running the app for the first time
## then change to "update" which just updates the schema when necessary
#spring.jpa.hibernate.ddl-auto=create
#spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
spring.datasource.url= jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=hr
spring.datasource.password=hr

spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
## this shows the sql actions in the terminal logs
spring.jpa.show-sql=true
##optional, but just in case another application is listening on your default  port (8080)
server.port = 9999
```
   