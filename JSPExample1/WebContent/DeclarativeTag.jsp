<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Declaration Tag</title>
</head>
<body>

	<h1>Example for Declaration Tag...</h1>
	<%! 
		public int addnumbers(int n,int m)
		{
			int ans = n+m;
			return ans;
		}
	%>
	
	<%
		int n=10,m=20;
		int add = addnumbers(10,20);
	%>
	Addition of Two Numbers :  <%=add%>
	
</body>
</html>