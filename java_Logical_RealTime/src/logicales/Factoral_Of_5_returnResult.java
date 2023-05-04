package logicales;

public class Factoral_Of_5_returnResult {
    public static int factorial(int a,int b)
    {   int fact=1;
    	 while(a<=b)
    	 {
    		 fact=fact*a;
    		 a++;
    		
    	 }
    	 System.out.println(fact);
    	 
    	return 0;
    }
	public static void main(String[] args)
   {
		// TODO Auto-generated method stub
		factorial(1,5);
		
	}

}
