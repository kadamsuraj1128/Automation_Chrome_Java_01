package practic;

public class FactorialofFirstFivenumber {
	public static void Factorial(int a, int b) {
		int product = 1;
		for (; a <= b; a++) {
			product = product * a;
		}
		System.out.println(product);

	}

	public static void main(String[] args) {
		Factorial(1, 5);
	}
}
