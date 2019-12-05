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
