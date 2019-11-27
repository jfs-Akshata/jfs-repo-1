<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here!</title>
</head>
<body>
<form action="/java-web-master/hiddenField"  method="get">
<input type="text" name="name"/>
<input type="password" name="password"/>
<input type="hidden" name="captcha" value="#123"/>
<input type="submit" value="Login Please!"/>
</form>
</body>
</html>