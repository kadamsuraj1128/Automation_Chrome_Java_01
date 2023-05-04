package wapperClasses;

public class UnBoxing {
public static void main(String[]args)
{  //String into char is not possible
	String obj="12";
	int a=Integer.parseInt(obj);
	System.out.println(a);
	
	Integer obj1=42;
	int b=obj1.intValue();
	System.out.println(b);
	
}
}
