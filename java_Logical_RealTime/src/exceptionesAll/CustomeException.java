package exceptionesAll;

class AgeNotFoundException extends Exception
{
  AgeNotFoundException (String n)
     {
	super(n);
     }
}

public class CustomeException {
	public static void age(int a) throws AgeNotFoundException
	{
		if (a>=18)
		{
			System.out.println("  Eligble for vote");
		}
		else
		{
			throw new AgeNotFoundException("not eligible for vote");
		}
		
	}

	public static void main(String[] args) {
		try
		{
         age(15);
		}
		catch (Exception var)
		{
			System.out.println(var);
		}
	}
}

