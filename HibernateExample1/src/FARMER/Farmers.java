package FARMER;
import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.OneToOne;

//"mapping" entry to be made in the hibernate.cfg.xml file...
@Entity					//Required for the class whose TABLE is to be constructed...
public class Farmers 	//(name="") beside Entity can be used to name the table...
{
	@Id 
	int aadharno;
	String name;
	@OneToOne			//employee having one address...
	Address address;	//Now address's Primary key will be set as Foreign key in the Farmers Table...  
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address=address;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	
	
}
