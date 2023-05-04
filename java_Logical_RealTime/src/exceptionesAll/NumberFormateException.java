package exceptionesAll;

public class NumberFormateException {

	public static void main (String[]args)
	{
		String obj="a";
	try
	{
		int n=Integer.parseInt(obj);
	}
	catch(Exception var)
	{
		System.out.println(var);
	}
		
	}
}
