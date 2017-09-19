<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Demo.Student" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	Student s1 = new Student(1297,"Vaibhav");
%>

<h1>STUDENT INFORMATION</h1>	

<br>
Name :	<%=s1.getName()%></br>
<br>
RollNo : <%=s1.getRno()%></br>
Date : <%=new Date()%>
</body>
</html>