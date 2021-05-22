package exercise;

import lib.Input;

public class Ex10_6_1 {
	public static void main(String[] args) {
		int n, total = 0;
		do {
			n = Input.getInt();
			total += n;
		} while(n > 0);
		System.out.println("合計=" + total);
	}
}
