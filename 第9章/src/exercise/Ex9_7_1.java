package exercise;

import lib.Input;

public class Ex9_7_1 {
	public static void main(String[] args) {
		double d = Input.getDouble();
		double n = d > 0 ? Math.sqrt(d) : 0;
		System.out.println("n = " + n);
	}
}
