package CDAC;

import org.hibernate.cfg.Configuration;  
import org.hibernate.SessionFactory;
import org.hibernate.Session;
//import org.hibernate.annotations.Entity;

public class InsertExample 
{

	public static void main(String[] args) 
	{
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setEno(70);
		emp2.setAddress("Nashik");
		emp2.setEname("Seventh Employee");

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(emp2);			//Generates the table if not already present...
		session.getTransaction().commit();	//Inserts the values of the object in the Table...
		session.close();
	}

}
