package exercise;

import lib.Input;

public class Ex6_8_1 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		double b = Input.getDouble("b");
		String c = Input.getString("c");

		System.out.printf("a=%,8d%nb=%9.3f%nc=%10s%n", a, b, c);
	}
}
