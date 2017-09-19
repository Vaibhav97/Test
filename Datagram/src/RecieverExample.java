import java.net.*;
//import java.io.*;
//First initialize the Reciever then the Sender...

class RecieverExample
{
	//In this example run RecieverExample first...
	public static void main(String args[])throws Exception
	{
		DatagramSocket dgsocket = new DatagramSocket(7642);
		byte buff[] = new byte[1024];
		DatagramPacket dgpacket = new DatagramPacket(buff,1024);
		dgsocket.receive(dgpacket);
		
		System.out.println("Inside Reciever...");
		String st = new String(buff,0,30);
		System.out.println(st);
		dgsocket.close();
		
	}
}