package exceptionesAll;

import java.util.ArrayList;

public class IndexOutOfBoundException {
public static void main(String []args)
{ 
	ArrayList obj=new ArrayList();
	obj.add(12);
	obj.add(55);
	obj.add(65);
	try
	{
	System.out.println(obj.get(3));
	}
	
	catch(Exception var)
	{
		System.out.println(var);
	}
	
	System.out.println(obj.get(0));
	System.out.println(obj.get(1));
	
	
	}
}
