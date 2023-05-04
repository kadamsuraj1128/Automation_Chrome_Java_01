package practic;

public class ProgramForbreak {

	public static void main(String[] args) {
		int a=0;
		int b=4;
		while(a<=b)
		{   
			if(a==2)
			{
				System.out.println("if block");
				a++;
				break;
			}
			
			System.out.println(a);
			a++;
		}

	}

}
