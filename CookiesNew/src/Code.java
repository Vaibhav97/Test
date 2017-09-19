import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Code")
public class Code extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Code() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		String name = "Name";
		String pass = "Password";	
		
		Cookie cookie[] = request.getCookies();
		
		if(cookie.length>=1)
		{
			name = cookie[cookie.length-1].getName();
			pass = cookie[cookie.length-1].getValue();
			
		}
		
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title> LOGIN PAGE </title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<center>");
		pr.println("<h1> LOGIN ");
		pr.println("<form action=\"Cookies1\" >");
		pr.println("<table>");
		pr.println("<tr><td><b> Login ID </b></td>");
		pr.println("<td><input type=\"text\" name =\"no\" size=\"25\" value=\""+name+"\"></td></tr>");
		pr.println("<tr><td><b> Password </b></td>");
		pr.println("<td><input type=\"password\" name =\"pass\" size=\"25\" value=\""+pass+"\"></td></tr>");
		pr.println("<tr><td><input type=\"submit\" value=\"Submit\"></td></tr>");
		pr.println("</table>");
		pr.println("</form>");
		pr.println("</center>");
		pr.println("</body>");
		pr.println("</html>");
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	
	
	}

}
