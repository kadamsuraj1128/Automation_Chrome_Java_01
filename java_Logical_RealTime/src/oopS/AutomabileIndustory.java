package oopS;

interface Brand {
	final static int No = 5400;
}

interface Tata extends Brand {
	final static String carTata = "Nexone";
}

interface Mahindra extends Brand {
	final static String carMahi = "Thar";
	public static void empNo()
	{
		System.out.println("Currently 2450 employee on role");
		
	}
}

public class AutomabileIndustory implements Mahindra, Tata {

	public static void main(String[] args) {
		System.out.println(carTata);
		System.out.println(carMahi);
		Mahindra.empNo();
		System.out.println("Total number of employee " + No);

	}

}
