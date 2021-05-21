package exercise;

import lib.Input;

public class Ex9_7_2 {
	public static void main(String[] args) {
		int a = Input.getInt();
		String str = a % 2 == 0 ? "偶数" : "奇数";
		System.out.println(str);
	}
}
