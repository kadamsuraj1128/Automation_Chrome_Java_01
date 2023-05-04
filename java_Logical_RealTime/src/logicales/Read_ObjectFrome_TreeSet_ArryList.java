package logicales;

import java.util.ArrayList;
import java.util.TreeSet;

public class Read_ObjectFrome_TreeSet_ArryList {

	public static void main(String[] args) 
	{ TreeSet obj=new TreeSet();
	   obj.add(12);
	   obj.add(75);
	   obj.add(15);
	   obj.add(15);
	 ArrayList Al=new ArrayList(obj);
	
	 
	 for(int i=0;i<Al.size();i++)
	 {
		 System.out.println(Al.get(i));
	 }

	}

}
