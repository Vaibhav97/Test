import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

//We have to take 3 Servlets....1 for HTML...2 for Validation and Cookie display...
//Complete this compulsarily...

@WebServlet("/Cookies1")
public class Cookies1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public Cookies1() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		String noc = request.getParameter("no");
		String noc1 = request.getParameter("pass");
		
		Cookie cookie = new Cookie(noc,noc1);
		response.addCookie(cookie);
		
		if(noc1.equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/Code");
			rd.forward(request, response);
		}
		
		else
		{
			pr.println("Login Successful...");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
