package logicales;

public class Exception_Nested_tryCatch {

	public static void main(String[] args)
	{
	 System.out.println("main bigine");
    //Nested try catch block
              String obj="a";
    try {
    	
    try
    {
    	int a=Integer.parseInt(obj);     //NumberFormatException
    }
    catch (Exception variable)
    {
    System.out.println(variable);	
    }
      }
    catch (Throwable var)
    {
    System.out.println(var);	
    }
    //Finally used to if exception handle or not that task is mandetory to execute
    finally
    {
    	System.out.println("mandetory");
    }
    
    System.out.println("main End");
	}

}
