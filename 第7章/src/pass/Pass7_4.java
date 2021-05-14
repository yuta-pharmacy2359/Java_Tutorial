package pass;

import lib.Input;

public class Pass7_4 {
	public static void main(String[] args) {
		double[] x = {10.2, 4.5, 12.5, 8.0, 5.5};
		double a = Input.getDouble("double");
		for(int i = 0; i < 5; i++) {
			double ans = x[i] * a;
			System.out.printf("%6.1f%10.1f%n", x[i], ans);
		}
	}
}
