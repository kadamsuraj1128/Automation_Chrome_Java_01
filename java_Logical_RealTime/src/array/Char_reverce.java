package array;



public class Char_reverce {

	public static void main(String[] args) {
	 char [] x= {'a','b','c'}; 
	 for(int index=0;index<x.length;index++)
	 {
		System.out.print(" "+x[index]); 
	 }
	 System.out.println(" Reverce array integer");
	 
	 for(int index=x.length-1;index>=0;index--)
	 {
		 System.out.print(" "+x[index]);
	 }

	}

}
