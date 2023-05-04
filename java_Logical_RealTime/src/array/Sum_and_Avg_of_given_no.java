package array;

public class Sum_and_Avg_of_given_no {

	public static void main(String[] args) {
		int[] subject= {51,1,44,45,87,58};
		int sum=0;
		for(int index=0;index<subject.length;index++)
		{
			sum=sum+subject[index];
		}
		System.out.println("sum of the given number "+sum);
		
		double avg=sum/subject.length;
		
		System.out.println("Avrage of the given number "+avg);
	}

}
