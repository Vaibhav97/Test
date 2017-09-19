import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Example1
 */
@WebServlet("/Example1")
public class Example1 extends GenericServlet 
{
	@Override
	public void service(ServletRequest arg0,ServletResponse arg1)throws ServletException,IOException
	{
		arg1.setContentType("text/html");
		PrintWriter pr = arg1.getWriter();
		pr.println("<B>Welcome...");
	}

}
