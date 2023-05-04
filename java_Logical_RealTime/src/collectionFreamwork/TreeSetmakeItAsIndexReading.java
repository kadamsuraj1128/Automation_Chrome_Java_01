package collectionFreamwork;
import java.util.TreeSet;
import java.util.ArrayList;

public class TreeSetmakeItAsIndexReading {

	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(12);
		obj.add(55);
		obj.add(36);
		ArrayList al=new ArrayList(obj);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		

	}

}
