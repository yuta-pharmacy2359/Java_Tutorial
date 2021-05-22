package exercise;

import lib.Input;

public class Ex10_4_1 {
	public static void main(String[] args) {
		double total = 0, amount = 0, n;
		while((n = Input.getDouble()) != 0) {
			total += n;
			++amount;
		}
		System.out.printf("合計=" + "%6.3f%n", total);
		System.out.printf("平均=" + "%6.3f%n", total / amount);
	}
}
