package HQLExample;
import javax.persistence.Entity;  
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.*;

@Entity
public class Answers 
{
	@Id 
	int answerno=0;
	String op1,op2,op3,op4;
	String requiredans;
	
	public int getAnswerno() {
		return answerno;
	}
	public void setAnswerno(int answerno) {
		this.answerno=answerno;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public String getRequiredans() {
		return requiredans;
	}
	public void setRequiredans(String requiredans) 
	{
		if(requiredans=="op1")
		{
			this.requiredans = this.op1;
		}
		else if(requiredans=="op2")
		{
			this.requiredans = this.op2;
		}
		else if(requiredans=="op3")
		{
			this.requiredans = this.op3;
		}
		else if(requiredans=="op4")
		{
			this.requiredans = this.op4;
		}
		
	}
	public boolean verifyAnswer(String v)
	{
		if(v.equals(this.requiredans))
		{
			return true;
		}
		return false;
	}
	
}
