package oopS;

class customer {
	String Ename;
	private int Enum;

	customer(String name, int num) {
		this.Ename = name;
		this.Enum = num;
	}

	public int getNum() {
		return this.Enum;
	}

	public void setNum(int number) {
		this.Enum = number;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		customer c = new customer("ram", 1500);
		System.out.println(c.getNum());
		c.setNum(2000);
		System.out.println(c.getNum());

	}

}
