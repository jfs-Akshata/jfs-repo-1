package com.listeners;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextParamAnno")
public class ContextParamAnno extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ServletContext servletContext = getServletContext();
		System.out.println(servletContext.getInitParameter("messageKey"));
		resp.getWriter().println(servletContext.getInitParameter("messageKey"));
	}
}

//Lab 1 : implement HttpSessionListener
//Lab 2 : implement HttpSessionAttributeListener