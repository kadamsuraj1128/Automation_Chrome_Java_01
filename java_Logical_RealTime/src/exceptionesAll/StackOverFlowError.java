package exceptionesAll;

public class StackOverFlowError {
    public static void test()
    {
    	System.out.println("test1");
    	test();
    }
	public static void main(String[] args) 
	{
		try
		{
          test();
		}
		catch(Error var)
		{
			System.out.println(var);
		}
	}

}
