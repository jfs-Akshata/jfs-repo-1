//Lab : implement a hitcounter
package com.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.NonWritableChannelException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		//out.println("<h1>Writing a cookie</h1>");
		 //writeCookie(resp);
		resp.getWriter().println("Reading Cookie!");
		readCookies(req, resp);
		
	}

	private void writeCookie(HttpServletResponse resp) throws IOException {
		// create the cookie
		Cookie counterCookie = new Cookie("counter", "1");
		// setting the life of the cookie to 1 minute
		counterCookie.setMaxAge(60*60);
		// add the cookie to the response
		resp.addCookie(counterCookie);
		resp.getWriter().println("Cookie written");
	}

	private void readCookies(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	//fetch the cookies
		Cookie cookies[]= req.getCookies();
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("counter")){
			resp.getWriter().println("You have visited : " + cookie.getValue());
		}
	}
	}
}