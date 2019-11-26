package com.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1>Product Page..</h1>");
		//Reuturns an existing session if it exists, else create new session
		HttpSession  httpSession = req.getSession();
		Object productsInCart = httpSession.getAttribute("productsInCart");
		if(productsInCart == null)
		{
		httpSession.setAttribute("productsInCart", 1);
		System.out.println(1 + " product(s) in cart.");
		}else {
			Integer count =  (Integer)productsInCart + 1;
			httpSession.setAttribute("productsInCart", count);
			System.out.println(count + " product(s) in cart.");
		}
	}

}
