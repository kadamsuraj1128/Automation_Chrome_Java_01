package exceptionesAll;


public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int []a= {12,45,56,22};
		
		try 
		{
		System.out.println(a[4]);
		}
		catch(Exception var)
		{
			System.out.println(var);
		}
		
		
	}

}
