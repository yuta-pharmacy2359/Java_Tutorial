package sample;

import lib.Input;

public class Sample6_9 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");

		System.out.printf("%dと%dの合計は%dです%n", a, b, a + b);
	}
}
