package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1. Load the driver
	Class.forName("com.mysql.jdbc.Driver");
	//	2. Get the connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsdb","root","mysql");
//	3. Create the query
	Statement statement = connection.createStatement();
//	4. Execute the query
	ResultSet resultset = statement.executeQuery("select * from employee");
//	5. Display the results
	while(resultset.next()) {
//		System.out.println(resultset.getString("first_name"));
//		System.out.println(resultset.getString("last_name"));
		System.out.println(resultset.getString(1));
		System.out.println(resultset.getString(2));
	}
	resultset.close();
	statement.close();
	connection.close();
//	6. Close the connection
}
}
