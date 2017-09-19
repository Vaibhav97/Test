package HQLExample;

import org.hibernate.cfg.Configuration;      
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.*;

public class Exam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Answers answer1 = new Answers();
		Questions question1 = new Questions();
		
		answer1.setAnswerno(2);
		answer1.setOp1("OOP");
		answer1.setOp2("POOP");
		answer1.setOp3("Both");
		answer1.setOp4("None");
		answer1.setRequiredans("op1");
		
		question1.setQuesno(2);
		question1.setQuestion("C++ is: ");
		question1.setAnswer(answer1);
		
		/*
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(question1);
		session.save(answer1);
		session.getTransaction().commit();			//For Adding questions to the Database...
		session.close();
		sessionfactory.close();
		*/
		
		String str1,str2;
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		str1 = "from Questions";
		str2 = "from Answers";

		Query q1 = session.createQuery(str1);
		Query q2 = session.createQuery(str2);
		List<Questions> l1 = (List<Questions>)q1.list();
		List<Answers> l2 = (List<Answers>)q2.list();
		String answer;
		int score=0;
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("Question No. "+(i+1));
			System.out.println(l1.get(i).getQuestion());
			System.out.println(" 1) "+l2.get(i).getOp1()+" 2) "+l2.get(i).getOp2()+" 3) "+l2.get(i).getOp3()+" 4) "+l2.get(i).getOp4());
			System.out.println("Input Answer: ");
			System.out.println();
			int ch = sc.nextInt();
			boolean verr=false;
			if(ch==1)
			{
				answer = l2.get(i).getOp1();	
				verr = l2.get(i).verifyAnswer(answer);
				if(verr==true)
				{
					System.out.println("Correct Answer.");
					score++;
					System.out.println();
					continue;
				}
				System.out.println("Incorrect Answer.");
				System.out.println();
			}
			else if(ch==2)
			{
				answer = l2.get(i).getOp2();
				verr = l2.get(i).verifyAnswer(answer);
				if(verr==true)
				{
					System.out.println("Correct Answer.");
					score++;
					System.out.println();
					continue;
				}
				System.out.println("Incorrect Answer.");
				System.out.println();
			}
			else if(ch==3)
			{
				answer = l2.get(i).getOp3();
				verr = l2.get(i).verifyAnswer(answer);
				if(verr==true)
				{
					System.out.println("Correct Answer.");
					score++;
					System.out.println();
					continue;
				}
				System.out.println("Incorrect Answer.");
				System.out.println();
			}
			else if(ch==4)
			{
				answer = l2.get(i).getOp4();
				verr = l2.get(i).verifyAnswer(answer);
				if(verr==true)
				{
					System.out.println("Correct Answer.");
					score++;
					System.out.println();
					continue;
				}				
				System.out.println("Incorrect Answer.");
				System.out.println();
			}
			else
			{
				System.out.println("Wrong Input Entered....");
				System.out.println();
			}
		}
		System.out.println("Total Score: "+score);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}
