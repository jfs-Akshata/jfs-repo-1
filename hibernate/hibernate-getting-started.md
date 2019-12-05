# What is hibernate?
ORM = Object Relational Mapping
Maps Java Objects to Database Tables

# What are the pain points in JDBC
1. database dependent queries
2. handle numerous checked exceptions
3. redundant boiler plate
4. error-prone due to front-end data types and back end datatypes
5. queries are hard coded, tough to construct
# Advantages of hibernate
1. logic independent of database
2. handle lesser exceptions related to database
3. compact code
4. hibernate maps datatypes of the front end to compatible types in the backend
5. query java objects instead of writing sql queries
6. OOPS : Inheritance relationships are meapped easily

# Code Walk Through
1. Configuration Setup
persistence.xml (web.xml : DispatcherServlet)
mapping : student.hbm.xml = (applicationContext.xml, dispatcher-servlet.xml) (beans and wiring)
2. Libraries Setup
Hibernate jars : jdbc.jar + db vendor jar. (Spring Jars)
3. API
EntityManager = find(),persist(),remove(),merge() (ApplicationContext = getBean())

# Demo 1 : Perform Manual Mapping 
package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class CustomORMDemo{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Employee employee = new Employee("Ryan", "Dahl");
	CustomORM.saveORMEmployee(employee);
	List<Employee> employees = CustomORM.getORMEmployees();
	employees.forEach(System.out::println);
}

}
//Java Object 
class Employee {
	private String firstName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

class CustomORM {
	public static List<Employee> getORMEmployees()
			throws ClassNotFoundException, SQLException {
		List<Employee> employeeList = new ArrayList<Employee>();
		// 1. Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// 2. Get the connection
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jfsdb", "root", "mysql");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from employee");
		// 5. Display the results
		while (resultset.next()) {
			String firstName = resultset.getString("first_name");
			String lastName = resultset.getString("last_name");
			employeeList.add(new Employee(firstName, lastName));
			// System.out.println(resultset.getString("first_name"));
			// System.out.println(resultset.getString("last_name"));
//				System.out.println(resultset.getString(1));
//				System.out.println(resultset.getString(2));

		}
		resultset.close();
		statement.close();
		connection.close();
		return employeeList;
		// 6. Close the connection
	}

	public static void saveORMEmployee(Employee employee)
			throws ClassNotFoundException, SQLException {
		// 2. Get the connection
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jfsdb", "root", "mysql");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Insert the employee
		int noOfRowsAffected = statement
				.executeUpdate("insert into employee values ('"
						+ employee.getFirstName() + "','" + employee.getLastName() + "')");
		// 5. Display the results
		System.out.println("Inserted : " + noOfRowsAffected + " employee(s)!");
		statement.close();
		connection.close();
		// 6. Close the connection
	}
}
# Demo 2 : Perform CRUD Operations Using Hibernate
1. create a java application l01-crud-hibernate-oracle-mysql
2. adding hibernate jar files to the lib folder
3. set the classpath for the hibernate jars
4. configure hibernate based on jpa : /1a-crud-hibernate-oracle-mysql/src/META-INF/persistence.xml
`<?xml version="1.0" encoding="UTF-8"?>
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
		</properties>
	</persistence-unit>
</persistence>`
5. create the entity
com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student  {
	@Id
	private int studentId;
	private String name;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

6. create the dao
6.1 Create a utility class JPAUtil to get the EntityManagerFactory
// Use the Persistence and get the entity manager
// Use the EntityManagerFactory to get the EntityManager 
package com.demo.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;

	}
}

6.2 Implement StudentDao 
package com.demo.dao;

import com.demo.entity.Student;

public interface StudentDao {

	public abstract Student getStudentById(int id);

	public abstract void addStudent(Student student);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}

6.3 Implement StudentDAOImpl
package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.demo.entity.Student;

public class StudentDAOImpl implements StudentDao{
private EntityManager entityManager = null;

	public StudentDAOImpl(EntityManager entityManager) {
	entityManager = JPAUtil.getEntityManager();
}

	@Override
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, 100);
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		System.out.println("Student persisted in the database");
	}

	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public void commitTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.commit();
	}

	@Override
	public void beginTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.getTransaction().begin();
	}

}

# Refer the demo for more code. l01-crud-hibernate-oracle-mysql 

CREATE TABLE `jfsdb`.`students` (
  `studentId` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`studentId`));
