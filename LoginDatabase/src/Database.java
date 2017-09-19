//import java.util.*;
//import java.io.*;
import java.sql.*;

public class Database 
{
	static final String CONNECTION1 = "jdbc:postgresql://localhost:5432/postgres";
	static final String CONNECTION2 = "postgres";
	static final String CONNECTION3 ="vaibhav";

	Database()
	{}
	
	public void add(String str1, String str2)throws SQLException
	{
		Connection c = DriverManager.getConnection(CONNECTION1, CONNECTION2, CONNECTION3);
		PreparedStatement ps = c.prepareStatement("Insert into logindetails values(?,?)");
		ps.setString(1, str1);
		ps.setString(2, str2);
		/*
		int ch = ps.executeUpdate();
		if(ch==1)
		{
			return ch;
		}
		return 0;
		*/
	}
	
	public void validate(String str1, String str2)throws SQLException
	{
		Connection c = DriverManager.getConnection(CONNECTION1, CONNECTION2, CONNECTION3);
		Statement statement = c.createStatement();
		ResultSet resultset = statement.executeQuery("select * from logindetails");
		while(resultset.next())
		{
			String st1,st2;
			st1 = resultset.getString(1);
			st2 = resultset.getString(2);
		}
		//return 0;
	}
}
