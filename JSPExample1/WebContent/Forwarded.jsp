<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="IncludeExample.jsp"></jsp:include>
	<%//Above statement can be reused anywhere in this code and there the Above page will be displayed... %>
	<h1>Welcome to the Forwarded Page	<br>
		Passed Parameters are: <br>
	</h1>
	
	<%=request.getParameter("Student1")%>
	<br><br>
	<h2>ALL STUDENTS: </h2>
	<% 
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements())
		{
			String str1 = (String) e.nextElement();
			%>
			<% 
				
			out.println(request.getParameter(str1));
		}
	%>
	<br>NOTE: Prints in Sorted order according to the VALUES...<br>
</body>
</html>