import java.net.*;
import java.util.*;
import java.io.*;

class Client1
{
		//NOTE: Never close the streams of datainput and dataoutput until end of program or EOFException occurs...
	public static void main(String args[])throws Exception
	{
		Scanner damn = new Scanner(System.in);
		String h,h1,h2;	//h1 for input and h2 for output... 	
		Socket sc = new Socket("localhost",4511);
		DataOutputStream cout = new DataOutputStream(sc.getOutputStream());
		DataInputStream cin = new DataInputStream(sc.getInputStream());
		h = "Hello SERVER...";
		
		cout.writeUTF(h);
		cout.flush();
		//cout.close();
		h1 = cin.readUTF();
		int flag=0;
		System.out.println(h1);
		while(flag!=1)
		{
			System.out.println("CLIENT writes : ");
			h2 = damn.nextLine();
			cout.writeUTF(h2);
			cout.flush();
			h1 = cin.readUTF();
			System.out.println("SERVER : "+h1);
			if(h1.equals("Bye"))
			{
				sc.close();
				flag=1;
				break;
			}
		}
		//sc.close();
		
	}
}