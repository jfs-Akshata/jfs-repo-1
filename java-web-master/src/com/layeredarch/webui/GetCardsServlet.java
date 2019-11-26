package com.layeredarch.webui;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.layeredarch.model.CreditCardModel;
import com.layeredarch.service.CreditCardServiceImpl;
import com.layeredarch.service.CreditCardServiceInterface;

@WebServlet("/cards")
public class GetCardsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. Access the service
		CreditCardServiceInterface cardServiceInterface = new CreditCardServiceImpl();
		// 2. Invoke the business method
		ArrayList<CreditCardModel> cardsArrayList = null;
		try {
			cardsArrayList = cardServiceInterface.getCreditCards();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. Display the records
		PrintWriter printWriter = resp.getWriter();
		for (int i = 0; i < cardsArrayList.size(); i++) {
			CreditCardModel cardModel = cardsArrayList.get(i);
			printWriter.println("<p>" + cardModel + "</p>");
		}

	}
}
