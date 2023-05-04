package array;

public class Odd_Even_by_using_Advance_for_loop {

	public static void main(String[] args) {
		int [] a= {5,6,25,84,26,44};
		
		//Enhanced for loop
		System.out.println("Even number in array.............");
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		
		
		System.out.println("Odd number in array................");
		for(int value:a)
		{
			if (value%2!=0)
				System.out.println(value);
		}

	}

}
