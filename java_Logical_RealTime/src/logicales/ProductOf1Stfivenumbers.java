package logicales;

public class ProductOf1Stfivenumbers {
	public static void product(int a, int b) {
		int prod = 1;
		for (; a <= b; a++) {
         prod=prod*a;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
      product(1,5);
	}

}
