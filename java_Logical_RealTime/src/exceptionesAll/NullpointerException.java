package exceptionesAll;

public class NullpointerException {

	public static void main(String[] args) {
		String s=null;
		try 
		{
		System.out.println(s.length());
		}
		
		catch(Exception var)
		{
			System.out.println(var);
			
		}
		System.out.println("Remaining execution");
	}

}
