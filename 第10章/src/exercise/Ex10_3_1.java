package exercise;

import lib.Input;

public class Ex10_3_1 {
	public static void main(String[] args) {
		double total = 0, n;
		while((n = Input.getDouble("double")) != 0) {
			total += n;
		}
		System.out.printf("合計=" + "%6.2f%n", total);
	}
}
