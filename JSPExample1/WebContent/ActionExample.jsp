<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="Forwarded.jsp">
		<jsp:param value="Ramesh" name="Student1"/>
		<jsp:param value="Suresh" name="Student2"/>
		<jsp:param value="Bhavesh" name="Student3"/>
		<jsp:param value="Jignesh" name="Student4"/> 
	</jsp:forward>
	
</body>
</html>