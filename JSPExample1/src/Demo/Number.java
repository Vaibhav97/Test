package Demo;
import java.io.Serializable;

public class Number implements Serializable
{
	int no1,no2;
	
	public Number()
	{}
	public int Add(int n,int m)
	{
		no1=n;
		no2=m;
		return (no1+no2);
	}
	
	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}
	
}
