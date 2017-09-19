package FARMER;

import org.hibernate.cfg.Configuration;    
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class InsertFarmer 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		//---------------------------Objects for INPUT--------------------
		/*
		Address add = new Address();
		add.setPin(422401);
		add.setCity("Nashik");
		add.setState("Maharashtra");
		add.setArea("Adgaon");
		
		Farmers f1 = new Farmers();
		f1.setAadharno(10);
		f1.setName("Taha");
		f1.setAddress(add);
		/*
		System.out.println("Name: "+f1.getName());
		System.out.println("Aadhar No: "+f1.getAadharno());
		Address addnew = f1.getAddress();
		System.out.println("Address: "+f1.getAddress().getArea()+", "+addnew.getCity()+", "+addnew.getState()+", PIN-"+addnew.getPin());
		*/
		//----------------------------INSERTION-------------------------
		
		/*
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(f1);
		session.save(add);
		session.getTransaction().commit();
		System.out.println("Records Inserted in Farmers Successfully...");
		session.close();
		*/	
		//--------------------ACCESSING from Database--------------------
		/*
		Session session1=sessionfactory.openSession();
		session1.beginTransaction();
		
		Farmers newfarmer = (Farmers) session1.get(Farmers.class , 20);	//Class_name , Primary key value
		System.out.println("Farmer Information:-");
		System.out.println("Name: "+newfarmer.getName());
		System.out.println("Aadhar Number: "+newfarmer.getAadharno());
		
		Address addr = newfarmer.getAddress();
		System.out.println("Address: "+addr.getArea()+", "+addr.getCity()+", "+addr.getState()+", PIN-"+addr.getPin());
		session1.close();
		*/
		//---------------------ACCESSING using HQL-----------------------
		
		//SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		/*
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		String str1 = "from Address";		//NOTE: HibernateQuery requires the Class_name...
		Query q1 = session.createQuery(str1);
		//q1.setFirstResult(1);			//From where to START(DEFAULT stored in calling object)....
		//q1.setMaxResults(2);			//Till where to proceed...	
		List <Address> l1 = (List<Address>)q1.list();
		System.out.println("Size: "+l1.size());
		//int i=0;
		for(Address i:l1)					//Foreach loop...
		{
			System.out.println("Area: "+i.getArea());
			System.out.println("City: "+i.getCity());
			System.out.println("State: "+i.getState());
			System.out.println("Pin: "+i.getPin());
			System.out.println();
			
		}
		session.close();
		*/
		//------------------UPDATION using HQL-----------------------
		/*
		Session session = sessionfactory.openSession();
		String str1 = "update Farmers set name=:c where aadharno=:p"; //NOTE: HibernateQuery requires the Class_name...
		session.beginTransaction();
		Query q1 = session.createQuery(str1);
		q1.setParameter("c","Mumbai");
		q1.setParameter("p",40);			//Entry no.20 is CORRUPT...
		session.getTransaction().commit();
		System.out.println("Value: ");
		int i =q1.executeUpdate();
		System.out.println("Value: "+i);
		
		session.close();
		
		Session session1 = sessionfactory.openSession();
		Query q2 = session1.createQuery("from Address");
		List <Address> l1 = (List<Address>)q2.list();
		System.out.println("Size: "+l1.size());
		//int j=0;
		for(Address j:l1)					//Foreach loop...
		{
			System.out.println("Area: "+j.getArea());
			System.out.println("City: "+j.getCity());
			System.out.println("State: "+j.getState());
			System.out.println("Pin: "+j.getPin());
			System.out.println();
			
		}
		session1.close();
		*/
		//------------------SAME PARAMETERS Using HQL------------------------
		/*
		Session session = sessionfactory.openSession();
		String str1 = "from Farmers where address_pin=:c"; //NOTE: HibernateQuery requires the Class_name...
		session.beginTransaction();
		Query q1 = session.createQuery(str1);
		q1.setParameter("c",411043);
		session.getTransaction().commit();
		//System.out.println("Value: ");
		List <Farmers> l1 = (List<Farmers>)q1.list();
		System.out.println("Size: "+l1.size());
		for(Farmers j:l1)					//Foreach loop...
		{
			System.out.println();
			System.out.println("Name: "+j.getName());
			System.out.println("Aadhar Number: "+j.getAadharno());
			System.out.println("Address: "+j.getAddress().getArea()+","+j.getAddress().getCity()+","+j.getAddress().getState()+","+j.getAddress().getState());
		}
		session.close();
		*/
		//-----------------------MAX and MIN Using HQL----------------------
		Session session = sessionfactory.openSession();
		String str1,str2;
		str1 = "select max(pin) from Address";			//Include max or min...
		str2 = "from Address where pin=:p";
		session.beginTransaction();
		
		Query q1 = session.createQuery(str1);
		List<Integer> l1 = (List<Integer>)q1.list();
		int code = l1.get(0);
		System.out.println("PINCODE: "+l1.get(0));
		
		Query q2 = session.createQuery(str2);
		q2.setParameter("p", code);
		List<Address> l2 = (List<Address>)q2.list();
		System.out.println("Address: "+l2.get(0).getCity());
		
		//---------------------------------------------------------------
		session.close();
		//---------------------------------------------------------------
			
		sessionfactory.close();
	}
}
