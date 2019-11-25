# building an simple crud application using layered architecture
> implementing a layered architecture
1. creating the model layer
2. create the exception layer
3. create the service layer

# what are servlets?
1. server-side java programs
2. run on a jvm
3. servers that run servlets are ApacheTomcat,JBoss,WebLogic,WebSphere,Glassfish
4. servlets run on a servlet container. ( JVM : specification, JRE : implementation), (Servlet Container : specification, servers : implementation)
5. run on the server and send results to client (browser)
6. web based programs

# exploring a simple web app
## terminology : request, response, client, server, protocol
<request : request moves from client to server
<response : the result of server processing is sent back to the client as a response.> 
<client : a process which fires the request
<server : a process that handles the request, performs logic and sends the response>
<protocol : set of rules governing the transfer of information acorss the network, eg: http (html), ftp(files),smtp(mails)
<servlet api>
<servlet container : a runtime for servlets>
<cofiguration : settings for an application>
<configuration types : xml, annotation (xml + annotations), java (annotations)>
<request-response cycle : roundtrip>

http://localhost:8080/java-web-master/welcome
http: protocol
localhost: domain or ipaddress
8080: prot
java-web-master : webcontext
welcome : resource
# connect with the past and future
core : java > jvm
web : servlet based on java > servlet container based on jvm
frameworks : spring & struts are based on servlets  > servlet containers based on jvm.
core + servlet + framework 

# [principles : data structures and their relationships, how systems work, patterns and best practices]

# enterprise architecture

# servlet life cycle
java program : main
servlet : init(), service() and destroy()

# servlet api
javax.servlet
Servlet init, service, destroy.; getServletInfo, getServletConfig
Servlet (deals with any protocol)
javax.servlet.GenericServlet : use it and write all the code for HTTP handling mechanism.

# HTTP verbs vs DBMS vs CRUD operations
* get (fetch any resource from the server) (select)
* post (create a new resource on the server) (insert)
* put  (modify an existing resource server) (update)
* delete (remove a resource from the server) (delete)

# HttpServlet
doGet, if the servlet supports HTTP GET requests
doPost, for HTTP POST requests
doPut, for HTTP PUT requests
doDelete, for HTTP DELETE requests
init and destroy, to manage resources that are held for the life of the servlet
getServletInfo, which the servlet uses to provide information about itself

# what is web.xml
a cofiguration file
in xml format
contains configuration settings for the web application
confuration about servlets, jsp, life-cycle events
xml was the earliest method of configuration, followed by annotation configuration (web.xml + annotations), the latest being java configuration (only annotations and no web.xml)

# our first servlet
1. set up ApacheTomcat
2. start ApacheTomcat
3. use the service method, appliation with layered architecture.