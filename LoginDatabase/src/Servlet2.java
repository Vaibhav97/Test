//NOTE: Unable to CONNECT to Database in Servlet due to unhandling of Exceptions so 
//creating a Class for dealing with database operations...  

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;
import java.io.*;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
	public Servlet2() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		doGet(request, response);
		PrintWriter pr = response.getWriter();
		String name,pass;
		name = request.getParameter("name");
		pass = request.getParameter("password");
		pr.println("Name: "+name);
		pr.println("<br></br><br>Password: "+pass+"</br>");
		
		Database obj = new Database();
		try
		{
			obj.add(name, pass);
			
		}
		catch(Exception e)
		{
			pr.println("<br>Inside catch block...</br>");
			/*if(ch==1)
			{
				pr.println("<br>Record added Successfully...</br>");
			}
			else
			{
				pr.println("<br>Record not added Successfully...</br>");
			}
			*/
		}
	
	}

}
