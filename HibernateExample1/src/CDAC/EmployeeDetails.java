package CDAC;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity				//Mentions hibernate that this is a table...
public class EmployeeDetails 
{
	@Id	@GeneratedValue	//This "@Id" should be the Primary key and "@GeneratedValue" generates integer values automatically...
	int eno;
	String ename;
	String address;
	//NOTE: JAVA Developers should always know HQL...
	//HQL converts its Query into any SQL's Query wanted...  
	
	public String getAddress() 	//Using Generate Getters and Setters...
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public int getEno() 
	{
		return eno;
	}
	public void setEno(int eno) 
	{
		this.eno = eno;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	
}
