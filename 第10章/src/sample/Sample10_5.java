package sample;

import lib.Input;

public class Sample10_5 {
	public static void main(String[] args) {
		int total = 0, amount = 0, n;
		while((n = Input.getInt()) != 0) {
			total += n;
			++amount;
		}
		System.out.println("合計=" + total);
		System.out.println("件数=" + amount);
	}
}
