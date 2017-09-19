<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
<h1>LOGIN</h1>
	<form action="http://localhost:8080/JSPProje
	ct/Validate" method="post">
	<table>
	<tr><td>Login Name</td>
	</tr>
	<tr><td><input type="text" name="name" value=""/></td>
	</tr>
	<tr><td>Password</td>
	</tr>
	<tr><td><input type="password" name="password" value=""/></td>
	</tr>
	<tr><td><input type="submit" name="Submit" value="Submit"/></td>
	</tr>
	</table>

</form>
</body>
</html>