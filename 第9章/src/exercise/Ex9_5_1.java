package exercise;

import lib.Input;

public class Ex9_5_1 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");
		int c = Input.getInt("c");
		String str = Input.getString("str");

		boolean b1 = a >= 5 && a < 20;
		boolean b2 = a > b && a < c * 3;
		boolean b3 = a % 7 == 0 && a % 28 != 0;
		boolean b4 = !(a > b * 7);
		boolean b5 = !(str.equals("ABC"));

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
