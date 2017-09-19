import java.net.*;
import java.util.*;
import java.io.*;

class Server1
{
	
	public static void main(String args[])throws Exception
	{
		 Scanner dam = new Scanner(System.in);
		String s1,s2;				//s1 for reading and s2 for writing...
		ServerSocket sk = new ServerSocket(4511);
		System.out.println("Waiting For Client to Connect...");
		Socket sk1 = sk.accept();
		System.out.println("Connected Successfully...");
		DataInputStream obj = new DataInputStream(sk1.getInputStream());
		DataOutputStream obj2 = new DataOutputStream(sk1.getOutputStream());
		
		
		s1 = obj.readUTF();
		//obj.close();
		System.out.println(s1);
		System.out.println("SERVER : ");
		s2 = dam.nextLine();
		obj2.writeUTF(s2);
		obj2.flush();
		while(!s1.equals("Bye"))
		{
			s1 = obj.readUTF();
			System.out.println("CLIENT : "+s1);
			
			System.out.println("SERVER writes : ");
			s2 = dam.nextLine();
			obj2.writeUTF(s2);
			obj2.flush();
		//	obj2.close();
		}
		sk1.close();
	}
}