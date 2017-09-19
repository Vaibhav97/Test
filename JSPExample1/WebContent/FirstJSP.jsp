<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP...</h1>
	<%
		//Code written in this Scriplete tag goes into SERVICE method... 
		int n=10;
		int m=20;			//These tags enable us to write JAVA code...
		int ans=n+m;		//No need for restarting the server just REFRESH the page...
		out.print("Answer: "+ans);		//Printing...
		
	%>
	
	<%	for(int i=0;i<10;i++)
		{
			%>
			
			
			Value: <%=i%>
			<br/>
		<% 
		}
	%>
	
	
</body>
</html>