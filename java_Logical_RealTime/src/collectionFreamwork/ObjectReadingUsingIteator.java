package collectionFreamwork;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectReadingUsingIteator {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(12);
		obj.add(22);
		obj.add(66);
		Iterator it=obj.iterator();
		System.out.println(it.next());
        System.out.println(it.hasNext());
	}

}
