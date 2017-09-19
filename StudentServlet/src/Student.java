import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Student() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	PrintWriter pr = response.getWriter();
    	String str;
    	int roll=0;
    	double no1=0,no2=0,no3=0;
    	double percent1=0;
    	Enumeration <String> str1 = request.getParameterNames();
    	//ABOVE statement gets all ParameterNames present in HTML file in a string...
    	//If all share same data type then we can run them around a loop like BELOW and won't have to do it MANUALLY...  
    	/*while(str1.hasMoreElements())
    	{
    		str = request.getParameter(str1.nextElement());
    	}*/
    	str = request.getParameter("student");
    	roll = Integer.parseInt(request.getParameter("roll"));		//as getParameter() returns only String so we have to perform TYPE-casting...
    	no1 = Double.parseDouble(request.getParameter("maths"));	//as getParameter() returns only String so we have to perform TYPE-casting...
    	no2 = Double.parseDouble(request.getParameter("english"));	//as getParameter() returns only String so we have to perform TYPE-casting...
    	no3 = Double.parseDouble(request.getParameter("science"));	//as getParameter() returns only String so we have to perform TYPE-casting...
    	
    	percent1 = (no1+no2+no3)/3;
    	
    	pr.println("<br>Name: "+str+"<br>");
    	pr.println("</br>Roll Number: "+roll+"<br>");
    	pr.println("</br>Total percent: "+percent1+"<br>");
    	pr.println("</br>");
    	//pr.println("English percent: "+percent2);
    	//pr.println("Science percent: "+percent3);
    
    	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
