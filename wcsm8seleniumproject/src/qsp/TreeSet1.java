package qsp;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet obj = new TreeSet();

		obj.add(12);
		obj.add(35);
		obj.add(15);

		ArrayList al = new ArrayList(obj);

		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println(obj);
		System.out.println(al);
	}

}
