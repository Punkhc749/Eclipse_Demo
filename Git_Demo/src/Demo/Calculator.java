package Demo;

public class Calculator {
	public static void main(String[] args) {

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public double sqrt(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Cannot calculate square roof of negative number ");
		}
		return Math.sqrt(a);
	}
}
