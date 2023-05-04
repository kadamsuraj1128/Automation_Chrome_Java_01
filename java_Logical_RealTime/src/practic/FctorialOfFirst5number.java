package practic;

public class FctorialOfFirst5number {
	public static void factorial(int a,int b)
	{
		int product=1;
		for(;a>=b;a--)
		{
		 product=product*a;
		 
		}
		System.out.println(product);
	}
	public static void main(String []args)
	{
		factorial(5,1);
	}

}
