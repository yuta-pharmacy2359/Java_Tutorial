package exercise;

import lib.Input;

public class Ex9_7_3 {
	public static void main(String[] args) {
		int n = Input.getInt("西暦");
		String str = (n % 4 == 0 && n % 100 != 0) || n % 400 == 0 ? "閏年です" : "平年です";
		System.out.println(str);
	}
}
