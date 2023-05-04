package array;

public class Odd_Even_by_using_Array {

	public static void main(String[] args) {
		int  [] a = { 5, 54, 15, 64, 25 };
		
		System.out.println("Even number...................");
		for (int index = 0; index < a.length; index++)
		{
		    if(a[index]%2==0) 
			System.out.println(a[index]);
		} 
		
		System.out.println("Odd number......................");
		for(int index=0;index<a.length;index++)
		{
			if(a[index]%2!=0)
				System.out.println(a[index]);
		}

	}

}
