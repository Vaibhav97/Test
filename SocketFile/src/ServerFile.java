import java.net.*;
import java.io.*;
//Implement with threads compulsarily...
class ServerFile
{
	public final static int SOCKET_PORT = 13267;
	public final static String FILE_TO_SEND = "source.txt";
	
	public static void main(String args[])throws Exception
	{
		ServerSocket servsock = new ServerSocket(SOCKET_PORT);
		Socket socket = null;
		BufferedInputStream bis=null;
		OutputStream os =null;
		FileInputStream fis =null;
		
		System.out.println("Waiting For Client to Connect...");
		try
		{	socket = servsock.accept();
			System.out.println("Connected Successfully...");
			
			File filobj = new File(FILE_TO_SEND);
			byte [] bytearr = new byte[(int)filobj.length()];
			
			fis = new FileInputStream(filobj);
			bis = new BufferedInputStream(fis);
			bis.read(bytearr,0,bytearr.length);
			os = socket.getOutputStream();
			os.write(bytearr,0,bytearr.length);
			//dos.flush();
			System.out.println("File transfer complete : SERVER...");
		}
		finally
		{
			if(bis!=null)
				bis.close();
			if(os!=null)
				os.close();
			if(socket!=null)
				socket.close();
			//if(servsock!=null)
				//servsock.close();	
		}
	}
}
