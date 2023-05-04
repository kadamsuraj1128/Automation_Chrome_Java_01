package logicales;
interface Compony
{
final int numT=20000;	

}

interface Tata extends Compony
{
	final int TataEmp=12000;
}

interface Mahindra extends Compony
{
	final int mahindraEmp=8000;
	
}


public class HibrideInheritance_Real_TimeE implements Mahindra,Tata
{
	public static void main(String[] args) 
	{
		System.out.println("No of empoloy working in Tata and Mahindra " +numT);
		System.out.println("No of empoloy working in Tata "+TataEmp);
		System.out.println("No of empoloy working in  Mahindra "+mahindraEmp);
	}
	

}
