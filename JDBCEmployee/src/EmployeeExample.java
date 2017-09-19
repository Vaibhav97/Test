import java.sql.*;
import java.util.*;

public class EmployeeExample
{int id=0;
	String name,designation;
	static final String CONNECTION1 = "jdbc:postgresql://localhost:5432/postgres";
	static final String CONNECTION2 = "postgres";
	static final String CONNECTION3 ="vaibhav";
	
	public EmployeeExample(int i,String n,String d)
	{
		id = i;
		name = n;
		designation = d;
	}
	
	public void add()throws Exception
	{
		Connection c = DriverManager.getConnection(CONNECTION1,CONNECTION2,CONNECTION3);
		PreparedStatement ps = c.prepareStatement("Insert into employee values(?,?,?)");
		ps.setInt(1, this.id);
		ps.setString(2, this.name);
		ps.setString(3, this.designation);
		
		int ch = ps.executeUpdate();	//Flag for Updating Database...
		if(ch==1)
		{
			System.out.println("Records Inserted Successfully...");
		}
	}
	
	
	/*
	public void addObject()
	{
		PreparedStatement ps = c.prepareStatement("Insert into Employee values(?,?,?)");
	}
	*/
	public static void main(String args[])throws Exception
	{
		Scanner scan = new Scanner(System.in);
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection(CONNECTION1,CONNECTION2,CONNECTION3);
		Statement statement = c.createStatement(); 
		
		EmployeeExample e1 = new EmployeeExample(40,"Aditya","BellBoy");
		EmployeeExample e2 = new EmployeeExample(50,"Adity","BellBoy");
		EmployeeExample e3 = new EmployeeExample(60,"Adit","BellBoy");
		EmployeeExample e4 = new EmployeeExample(70,"Aditi","BellGirl");
		
		//e1.add();
		//e2.add();
		//e3.add();
		e4.add();
		
		PreparedStatement ps = c.prepareStatement("Insert into employee values(?,?,?)");
		ResultSet resultset = statement.executeQuery("select * from employee");//Displays records...
		
		while(resultset.next())//Moves the cursor forward one row from its current position...
		{
			System.out.println("Id number: "+resultset.getInt(1));//Column 1...
			System.out.println("Name: "+resultset.getString(2));//Column 2...
			System.out.println("Designation: "+resultset.getString(3));
			System.out.println();
		}
	}
}