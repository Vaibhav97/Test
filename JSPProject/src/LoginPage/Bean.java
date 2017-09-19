package LoginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bean 
{
	static final String CONNECTION1 = "jdbc:postgresql://localhost:5432/postgres";
	static final String CONNECTION2 = "postgres";
	static final String CONNECTION3 ="vaibhav";
	
	public Bean()
	{
		
	}
	
	@Id
	String name;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate(String s1,String s2)//throws Exception
	{
		try
		{
			Class.forName("org.postgresql.Driver");
		}
		catch(ClassNotFoundException cp)
		{
			System.out.println("Class Exception thrown...");
		}
		try
		{
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","vaibhav");
			//System.out.println("Here.....");
			//Statement statement = c.createStatement();
			PreparedStatement ps = c.prepareStatement("select from bean where name="+s1);//Input wrong way...
			ResultSet resultset = ps.getResultSet();
			if(s2.equals(resultset.getString(2)))
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Connection Exception thrown..."+e);
		}
		return false;	
	
	}
	
}
