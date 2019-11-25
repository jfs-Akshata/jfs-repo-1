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
# connect with the past and future
core : java > jvm
web : servlet based on java > servlet container based on jvm
frameworks : spring & struts are based on servlets  > servlet containers based on jvm.
core + servlet + framework 

# [principles : data structures and their relationships, how systems work, patterns and best practices]