package com.configuration;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/InitParamServletAnno","/InitParamServletAnno1"},
initParams = {@WebInitParam(name="randomNumber", value="345"), 
@WebInitParam(name="randomMessage", value="Today is a lovely day!")})
public class InitParamServletAnno extends HttpServlet {
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
//		System.out.println(servletConfig.getInitParameter("randomMessage"));
	}
	private void loadContextParam() {
		ServletContext  servletContext = getServletContext();
		System.out.println(servletContext.getInitParameter("companyName"));
	}
}
//LAB
//context param using annotations