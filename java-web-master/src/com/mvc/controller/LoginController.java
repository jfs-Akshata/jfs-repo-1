package com.mvc.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginController")
public class LoginController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
    //1. Read all the parameters from the request
	  String userString = req.getParameter("name");
	  String passswordString = req.getParameter("password");
	  //2. perform validation
	  if(userString.contentEquals("admin") && passswordString.equals("adminpass")){
	  //3. obtain the request dispatcher to the resource
	  	RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login-success.jsp");
	  //4. forwared the request and response
	  	requestDispatcher.forward(req, resp);
	  }
	  else {
	  	RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login-error.jsp");
	  	requestDispatcher.forward(req, resp);
		}
}
}
