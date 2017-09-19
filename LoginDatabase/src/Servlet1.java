import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public Servlet1() 
	{
	    super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		String name,pass;
		name = request.getParameter("name");
		pass = request.getParameter("password");
		Database obj = new Database();
		try
		{
			obj.validate(name, pass);
			//pr.println("CH: "+ch);
			
		}
		catch(Exception e)
		{}/*
		finally
		{
			if(ch==1)
			{
				pr.println("Values FOUND...");
				pr.println("<br>Login successful...</br>");
				pr.println("<br>Welcome "+name+"</br>");
			}
			else 
			{
				pr.println("LOGIN Unsuccessful...");
			}
			//NOTE: Value of 'ch' is not changing...
		}
		
		/*
		if(pass.equals("admin"))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Servlet3");
			dispatcher.forward(request, response);	//FORWARDS the request to another SERVLET...
		}
		else
		{
			RequestDispatcher rd2 = request.getRequestDispatcher("/Login.html");
			rd2.include(request, response);			//INCLUDES the displaying page info...
			pr.println("<b></br><b></br><b></br><b> Wrong PASSWORD inserted </b>");
			pr.println("<b></br><b></br><b><b> SERVLET 1 </b>");
		}*/
	}

}
