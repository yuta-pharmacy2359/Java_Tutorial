package exercise;

import lib.Input;

public class Ex10_2_1 {
	public static void main(String[] args) {
		double x;
		while((x = Input.getDouble()) != 0) {
			System.out.printf("%5.3f%n", Math.sqrt(x));
		}
	}
}
