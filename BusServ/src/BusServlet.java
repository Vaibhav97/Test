import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/BusServlet")
public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BusServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		String noc = request.getParameter("no");
		
		if(noc==null)//&& !(noc.equals(" ")))			//As first time it will be null.....
		{	

			pr.println("<html>");
			pr.println("<head>");
			pr.println("<title>BUS RESERVATION</title>");
			pr.println("</head>");
			pr.println("<body>");
			pr.println("<center>");
			pr.println("<h1> Ticket Booking ");
			pr.println("<h4> Nashik - Pune ");
			pr.println("</center>");
			pr.println("<form action=\"BusServlet\">");
			pr.println("<table>");
			pr.println("<tr><td><b> Number of Candidates: </b></td>");
			pr.println("<td><input type=\"text\" name =\"no\" size=\"25\" value=\"\"></td></tr>");
			pr.println("<tr><td><b> Number of Adults: </b></td>");
			pr.println("<td><input type=\"text\" name =\"adult\" size=\"25\" value=\"\"></td></tr>");
			pr.println("<tr><td><b> Number of Senior Citizens: </b></td>");
			pr.println("<td><input type=\"text\" name =\"seniorc\" size=\"25\" value=\"\"></td></tr>");
			pr.println("<tr><td><b> Number of Children: </b></td>");
			pr.println("<td><input type=\"text\" name =\"child\" size=\"25\" value=\"\"></td></tr>");
			pr.println("<tr><td><input type=\"submit\" value=\"Submit\"></td></tr>");
			pr.println("</table>");
			pr.println("</form>");
			pr.println("</body>");
			pr.println("</html>");
		}
		else
		{

			//String noc = request.getParameter("no");
			int no = Integer.parseInt(noc);

			pr.println("<html>");
			pr.println("<head>");
			pr.println("<title>BUS RESERVATION</title>");
			pr.println("</head>");
			pr.println("<body>");
			pr.println("<center>");
			pr.println("<h1> Ticket Booking ");
			pr.println("<h4> Nashik - Pune ");
			pr.println("</center>");
			pr.println("<b> Number of Adults: </b>");
			pr.println("<input type=\"text\" name =\"adult\" size=\"25\" value=\"\">");
			pr.println("<b> Number of Senior Citizens: </b>");
			pr.println("<input type=\"text\" name =\"seniorc\" size=\"25\" value=\"\">");
			pr.println("<b> Number of Children: </b>");
			pr.println("<input type=\"text\" name =\"child\" size=\"25\" value=\"\">");
			pr.println("<input type=\"submit\" value=\"Submit\">");
			pr.println("</form>");
			pr.println("</body>");
			pr.println("</html>");
			//pr.println("<form action=\"BusServlet\">");
			//pr.println("Number"+no);
			//pr.println("<input type=\"submit\" value=\"Submit\">");
			//pr.println("</form>");
			//pr.println("</body>");
			//pr.println("</html>");

			int adu=0,sc=0,chld=0;
			int badu=0,bsc=0,bchld=0;

			adu = Integer.parseInt(request.getParameter("adult"));
			sc = Integer.parseInt(request.getParameter("seniorc"));
			chld = Integer.parseInt(request.getParameter("child"));

			badu = adu * 320;
			bsc = sc * 280;
			bchld = chld * 160;
			int total = badu + bsc + bchld; 

			pr.println("<br></br><br></br><br></br><br></br><br>Adult: "+badu+"<br>");
			pr.println("</br>Senior Citizen: "+bsc+"<br>");
			pr.println("</br>Children: "+bchld+"<br>");
			pr.println("</br>Total BILL: "+total+"<br>");
			pr.println("</br>");

		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
