<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--JAVA BEANS are mainly used to keep LOGIC and JSP page apart. 
JSP takes requests and provides response but MAIN Logic is kept in the Bean... -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj"  class="Demo.Number">
	<%//JAVA Beans are classes that have a default constructer and implements Serializable interface... %>
	</jsp:useBean>
	<% 
		int n = obj.Add(10,20);
	%>
	Addition is: <%=n%><br>
</body>
</html>