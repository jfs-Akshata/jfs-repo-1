package com.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ServletContextListenerEx  implements ServletContextListener{
@Override
public void contextInitialized(ServletContextEvent sce) {
	//web application initialization process is starting
	//before any filters or servlets in the webapplication are initialized. 
	System.out.println("Initializing the servlet context!");
	ServletContext servletContext = sce.getServletContext();
	servletContext.setInitParameter("messageKey", "Everthing is hard before it become easy");
}
@Override
	public void contextDestroyed(ServletContextEvent sce) {
	System.out.println("Destorying the servlet context!");
	}
}
