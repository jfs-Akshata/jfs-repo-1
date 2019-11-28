package com.sessionmanagement;

import java.io.IOException;
import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.OutputBuffer;

@WebServlet("/hiddenField")
public class HiddenField extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1. Read all the parameters from the request
		String userString = req.getParameter("name"); // ""
		String passswordString = req.getParameter("password");// ""
		String captchaString = req.getParameter("cap"); // null
		// 2. perform validation
		// if userString != null && passwordString != null, captchaString not
		// checked.
//		if (userString.contentEquals("admin") && passswordString.equals("adminpass")
//				&& captchaString.equals("#123")) {
	if (userString.contentEquals("admin") && passswordString.equals("adminpass")
	&& Optional.of(captchaString).equals("#123")) {
			resp.getWriter().println("Login successful!");
		} else {
			resp.getWriter().println("Login error!");
		}
	}
}
