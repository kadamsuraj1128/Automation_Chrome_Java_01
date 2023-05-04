package array;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] c;
		c = new int[5];
		System.out.println("Enter integer value");
		for (int index = 0; index < c.length; index++) {
			c[index] = scan.next().charAt(0);

		}
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
	}

}
