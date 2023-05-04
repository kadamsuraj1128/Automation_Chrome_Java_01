package array;

public class Highest_from_Array {

	public static void main(String[] args) {
		int [] x= {59,53,40,58,12};
		
		 int max=x[0];  //5
		 for(int index=0;index<x.length;index++) // 53-->40-->58-->12 
		 {
			 if(max<x[index])
			 {
				 max=x[index];
			 }
			 
		 }
		 System.out.println(max);

	}

}
