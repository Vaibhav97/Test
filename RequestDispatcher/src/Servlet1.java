import java.io.IOException; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
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
	{/*
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		String name,pass;
		name = request.getParameter("name");
		pass = request.getParameter("password");
		
		if(pass.equals("admin"))
		{
			//pr.println("<b></br><b></br><b></br><b> LOGIN SUCCESSFUL </b>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Servlet2");
			dispatcher.forward(request, response);	//FORWARDS the request to another SERVLET...
			
		}
		else
		{
			pr.println("<b></br><b></br><b></br><b> LOGIN FAILED </b>");
			pr.println("<b></br><b></br><b><b> SERVLET 1 </b>");
		}
		*/
	}
	
	//NOTE: The method mentioned in the HTML File will only work for respective SERVLETS (get or post)...
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		String name,pass;
		name = request.getParameter("name");
		pass = request.getParameter("password");
		
		if(pass.equals("admin"))
		{
			//pr.println("<b></br><b></br><b></br><b> LOGIN SUCCESSFUL </b>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Servlet2");
			dispatcher.forward(request, response);	//FORWARDS the request to another SERVLET...
			//pr.println("<b></br><b></br><b></br><b> LOGIN SUCCESSFUL </b>");
			
			
		}
		else
		{
			RequestDispatcher rd2 = request.getRequestDispatcher("/Login.html");
			rd2.include(request, response);			//INCLUDES the displaying page info...
			pr.println("<b></br><b></br><b></br><b> Wrong PASSWORD inserted </b>");
			pr.println("<b></br><b></br><b><b> SERVLET 1 </b>");
		}
		
	}

}
