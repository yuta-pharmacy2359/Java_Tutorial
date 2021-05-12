package pass;

import lib.Input;

public class Pass6_2 {
	public static void main(String[] args) {
		double a = Input.getDouble("a");
		double b = Input.getDouble("b");
		double c = Input.getDouble("c");
		double d = Math.abs(Math.pow(b, 2) - 4 * a * c);

		System.out.printf("ans=%5.2f%n", d);
	}
}
