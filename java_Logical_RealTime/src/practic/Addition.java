package practic;

public class Addition {
	public static int sumetion(int a,int b)
	{
		int sum=0;
		for(;a<=b;a++)
		{
			sum=sum+a;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		sumetion(0,5);
		
	}
	

}
