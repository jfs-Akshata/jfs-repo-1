<%--A simple java program to be converted into JSP --%>

<%@page language="java"%>
<%@page import="java.lang.String"%>
<%!String message = "welcome";%>
<b> <%
	for (int i = 0; i < 2; i++) {
%> <%=message%> <%
	}
%> 
<br>

<%
	for (int i = 0; i < 2; i++) {
		out.println(message);
	}
%> 
<br>

<%
	for (int i = 0; i < 2; i++) { %>
	<b>
		<% out.println(message); %>
	</b>
<%}%> 