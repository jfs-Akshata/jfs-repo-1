# MVC
* Model View Controller
* Model = contains data for the application (Collections)
* Views = user interface elements (JSP + Servlets : out.println("HTML Content"));
* Controller : contains the logic for tieng up models to views.

# Roadmap
1. implemented traditional mvc with servlets and JSP
2. implement MVC using spring

# Advantages for Spring MVC
1. Traditional web mvc with servlets and jsp had lots of API tied up.
2. Manually implement the functionality

1. Spring MVC is POJO based
2. Spring MVC comes in with baked in functionality

# Setup Spring mvc
## Spring SetUp Without Maven
1. New Dynamic Web Project
2. Set Target Runitme to Apache Tomcat.
3. Download the spring framework https://repo.spring.io/release/org/springframework/spring/5.0.2.RELEASE/
4. Load the lib directory with required jar files
5. Configure web.xml (DispatcherServlet : FrontController)
	<servlet>
		<servlet-name>dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/contextConfig.xml</param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
		<servlet-name>dispatcher</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
6. Configure contextConfig.xml
7.  Kill the Bug: <absolute-ordering />

# Instant Task (5. Configure web.xml) : 
@WebServlet("/loginController")
Write the xml representation for the controller.
	<servlet>
		<servlet-name>LoginController</servlet-name>
		<servlet-class>com.mvc.controller.LoginController</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>LoginController</servlet-name>
		<url-pattern>/loginController</url-pattern>
	</servlet-mapping>
	<servlet>

