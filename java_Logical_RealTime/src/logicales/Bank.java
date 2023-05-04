package logicales;

 abstract class Bank {
 abstract public void Roi();

}
class sbi extends Bank
{public void Roi()
	{
	System.out.println("Roi()");
	}
}
class City
{ public static void main(String[] args) {
	sbi s=new sbi();
	s.Roi();
	Bank B=s;
	B.Roi();
	
}
	}