package Demo;

public class Student 
{
	int rno;
	String name;
	
	public Student(int n,String s)
	{
		this.rno=n;
		this.name=s;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
