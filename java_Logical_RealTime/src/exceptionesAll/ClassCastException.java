package exceptionesAll;
import java.util.TreeSet;

public class ClassCastException {
	public static void main (String[]args)
	{
		TreeSet obj=new TreeSet();
		obj.add(12);
		obj.add(35);
		try
		{
		obj.add("a");
		}
		catch(Exception var)
		{
			System.out.println(var);
		}
		System.out.println(obj);
	}

}
