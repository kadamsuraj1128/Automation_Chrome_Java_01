package array;

public class To_cheack_subjectMark_more_50 {

	public static void main(String[] args) {
		int [] subject= {52,44,42,58,50};
		System.out.println("subject marks more then 50");
		for(int index=0;index<subject.length;index++)
		{
			   if(subject[index]>=50)
				System.out.println(subject[index]);
				
		}

	}

}
