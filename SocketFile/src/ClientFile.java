import java.net.*;
import java.io.*;

class ClientFile
{//Problem still PERSISTS...
	public final static int SOCKET_PORT = 13267;
	public final static String
    FILE_TO_RECEIVED = "sourcedownloaded1.txt";
	public final static int FILE_SIZE = 27;
	
	public static void main(String args[])throws Exception
	{
		Socket sc = new Socket("localhost",SOCKET_PORT);
		System.out.println("Connecting....");
		
		byte buff[] = new byte[FILE_SIZE];
		FileOutputStream fos = new FileOutputStream(FILE_TO_RECEIVED);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		InputStream is = sc.getInputStream();
	try
	{
		bos.write(buff,0,buff.length);	
		int bytesread = is.read(buff,0,buff.length);
		//System.out.println(buff.length);
		System.out.println(bytesread);
		int current = bytesread;
		do
		{
			bytesread = is.read(buff,current,buff.length-current);
			System.out.println(bytesread);
			if(bytesread>=0)
				current+=bytesread;
		}
		while(bytesread > -1);
		
		bos.write(buff,0,FILE_SIZE);
		bos.flush();
		System.out.println("File " + FILE_TO_RECEIVED+" downloaded (" +FILE_SIZE+ " bytes read)");
	}
			finally
			{
				if(fos!=null)
					fos.close();
				if(bos!=null)
					bos.close();
				if(sc!=null)
					sc.close();
			}
	}
}