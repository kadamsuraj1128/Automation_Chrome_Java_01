package logicales;
class Emp
{
	int Eid;
	Emp(int id)
	{
		this.Eid=id;
	}
	public String toString()
	{
		
		return "NASA"+this.Eid;
	}
}
public class RealTimeExample_toString {

	public static void main(String[] args) 
	{ Emp e=new Emp(1245);
	  System.out.println(e);
	 }
}
