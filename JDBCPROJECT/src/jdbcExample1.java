import java.sql.*;  
import java.util.*;

public class jdbcExample1
{
	public static void main(String args[])throws Exception
	{
			Scanner scan = new Scanner(System.in);
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","vaibhav");
			//Format is: "jdbc:postgresql://localhost:Port/DatabaseName","user","password"...
			Statement statement = c.createStatement();	//Creates a Statement object for sending SQL statements to the database...	
			PreparedStatement ps = c.prepareStatement("Insert into student values(?,?)");//An object that represents a precompiled SQL statement...
			//NOTE: Syntax is that Database name" values(?,?)" where each ? represents a parameter...

			//-----------For Addition--------------------------------------------------
			
			System.out.println("Enter the Roll Number: ");
			int rollno = scan.nextInt();
			System.out.println("Enter the Name: ");
			String name = scan.next();
			System.out.println(name);
			
			ps.setInt(1, rollno);		//Inserts into Database...
			ps.setString(2, name);		//Inserts into Database...
			
			int ch = ps.executeUpdate();	//Flag for Updating Database...
			if(ch==1)
			{
				System.out.println("Records Inserted Successfully...");
			}
			
			
			//-----------For Display--------------------------------------------------
			
			ResultSet resultset = statement.executeQuery("select * from student");//Displays records...
			
			while(resultset.next())//Moves the cursor forward one row from its current position...
			{
				System.out.println("Roll Number: "+resultset.getInt(1));//Column 1...
				System.out.println("Name: "+resultset.getString(2));//Column 2...
			}
			
			//-----------For Deletion--------------------------------------------------
			
			//NOTE: A/c to basic theory, write and check a statement in Query in the PostGreSQL if it works copy and put it in
			//the prepareStatement(body along with number of unknowns(?))and each ? will be dealt by from left to right
			//index and the parameters entered...
			
			System.out.println("Enter the row to be deleted: ");
			int row = scan.nextInt();
			//name = scan.next();
			PreparedStatement ds = c.prepareStatement("delete from student where studentnumber=?");
			//delete from student where studentnumber=10
			ds.setInt(1,row);
	
			int dh = ds.executeUpdate();	//Flag for Updating Database...
			if(dh==1)
			{
				System.out.println("Record Deleted Successfully...");
			}
			
			//---------------------For Updation-----------------------------------------
			
			
	
	}
}

