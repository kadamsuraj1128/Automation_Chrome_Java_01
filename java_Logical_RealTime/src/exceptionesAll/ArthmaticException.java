package exceptionesAll;

public class ArthmaticException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
		int result=a/b;
		 
		}
	//	catch(Exception var) Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
	//	{
	//	System.out.println(var);
	 
	//	}
		
		catch(ArithmeticException variable)
		{
			System.out.println(variable);
		}
		
	//upcasting happend  AirthmaticException-->Exception	
		catch(Exception var)
		{
			System.out.println(var);
		}
       
	}

}
