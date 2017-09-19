package LoginPage;
import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/Validate")
public class Validate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Validate() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
		
		//SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		PrintWriter pr = response.getWriter();
		Bean obj = new Bean();
		//obj.setName("Ankit@97");
		//obj.setPassword("ankit");
		//pr.println("IN VAlidate.java");
		//String str1 = "from Bean";
		/*
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		*/
		//Query q1 = session.createQuery(str1);
		String email,pass;
		email = request.getParameter("name");
		pass = request.getParameter("password");
		pr.println("Name: "+email+"   Password: "+pass);
		
		boolean value = obj.validate(email,pass);
		if(value==true)
		{
			pr.println("Login Successful...");
		}
		else
		{
			pr.println("Login Not Successful...");
		}
	}

}
