package com.layeredarch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.layeredarch.model.CreditCardModel;

public class CreditCardDAOImpl implements CreditCardDAOInterface{

	@Override
	public ArrayList getCreditCards() throws ClassNotFoundException, SQLException {
//		1. Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//	2. Get the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsdb","root","mysql");
//		3. Create the query
		Statement statement = connection.createStatement();
//		4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from employee");
//		5. Display the results
		ArrayList<CreditCardModel> creditCardModels = new ArrayList<CreditCardModel>();
		while(resultset.next()) {
			creditCardModels.add(new CreditCardModel(resultset.getString(1), resultset.getString(2)));
		}
		resultset.close();
		statement.close();
		connection.close();
//		6. Close the connection
		return creditCardModels;
	}

	@Override
	public CreditCardModel getCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
