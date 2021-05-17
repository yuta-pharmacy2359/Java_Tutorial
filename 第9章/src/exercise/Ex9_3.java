package exercise;

import lib.Input;

public class Ex9_3 {
	public static void main(String[] args) {
		char ch = Input.getChar();
		int n = 10;
		System.out.println(ch > 'a');
		System.out.println(ch < 97);
		System.out.println(ch <= '\u0041');
		System.out.println(ch >= 'A' + 1);
		System.out.println(ch == n);
		System.out.println(ch != 'a');
		System.out.println(ch != 1.05);
	}
}
