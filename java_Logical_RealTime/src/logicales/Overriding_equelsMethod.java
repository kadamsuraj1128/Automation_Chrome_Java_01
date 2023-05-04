package logicales;
class Emp1
{  String Ename;
   Emp1(String name)
   {
	   this.Ename=name;
   }
   public boolean equales(Object var)
   {   boolean n=false;
     if(this.Ename==((Emp1)var).Ename)
    {
    	 n=true;
    	   
     }
     return n;
	   
   }
	
}
public class Overriding_equelsMethod {

	public static void main(String[] args) 
	{
		Emp1 e=new Emp1("P");
		Emp1 e1=new Emp1("P");
		System.out.println(e.equales(e1));

	}

}
