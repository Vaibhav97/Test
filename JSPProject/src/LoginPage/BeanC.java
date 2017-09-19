package LoginPage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BeanC {

	public static void main(String[] args) 
	{
		Bean obj = new Bean();
		obj.setName("Vaibhav@97");
		obj.setPassword("vaibhav");

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
	}

}
