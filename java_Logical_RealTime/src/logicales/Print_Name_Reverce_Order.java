package logicales;

import java.util.ArrayList;
import java.util.Collections;
public class Print_Name_Reverce_Order {

	 

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 ArrayList obj=new ArrayList<>();
		 obj.add("s");
		 obj.add("u");
		 obj.add("r");
		 
		 obj.add("a");
		 obj.add("j");
		  
		 Collections.reverse(obj);
		 System.out.println(obj);
		 Thread.sleep(2000);
		 System.out.println(obj);

	}

}
