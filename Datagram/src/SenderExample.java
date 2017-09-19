import java.net.*; 
//import java.io.*;
//First initialize the Reciever then the Sender...
class SenderExample
{
	//byte [] buffarr = new
	public static void main(String args[])throws Exception
	{
		DatagramSocket dgsocket = new DatagramSocket();
		String str = "This is the Connectionless....";
		byte byarr[] = str.getBytes();
		InetAddress Ipaddr = InetAddress.getByName("localhost");
		DatagramPacket dgpacket = new DatagramPacket(byarr,str.length(),Ipaddr,7642);
		dgsocket.send(dgpacket);
		dgsocket.close();

	}
}