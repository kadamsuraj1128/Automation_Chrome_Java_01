package exceptionesAll;

public class StringIndexOutOfBoundException {
	public static void main(String[]args)
	{
		String a="suraj";
		
		System.out.println(a.charAt(0));
//nested try block
		try 
		{
		System.out.println(a.charAt(5));
		try
		{
			System.out.println(a.charAt(6));
		}
		catch(Throwable variable)
		{
			System.out.println(variable);
		}
		
		}
		
		catch(Exception var)
		{
			System.out.println(var);
		}
	}

}
