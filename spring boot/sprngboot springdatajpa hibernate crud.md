# CREATE A CRUD APPLICATION WITH SPRING BOOT, SPRING DATA JPA, HIBERNATE
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