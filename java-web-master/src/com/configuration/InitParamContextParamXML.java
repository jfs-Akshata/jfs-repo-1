package com.configuration;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamContextParamXML extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		loadInitParam();
		//loadContextParam();
	}

	private void loadInitParam() {
		//method 1
		System.out.println(getInitParameter("randomNumber"));
		System.out.println(getInitParameter("randomMessage"));
		//method 2
//		ServletConfig servletConfig = getServletConfig();
//		System.out.println(servletConfig.getInitParameter("randomNumber"));
	}
	private void loadContextParam() {
		ServletContext  servletContext = getServletContext();
		System.out.println(servletContext.getInitParameter("companyName"));
	}
}

//labs
// add additional context parameters.
