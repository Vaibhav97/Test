import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
		//rd.include(request, response);
		String str = request.getParameter("name");
		pw.println("<b></br><b></br><b></br><b> LOGIN SUCCESSFUL </b>"+str);
		pw.println("<b></br><b></br><b><b> SERVLET 2 </b>");
		
	}

}
