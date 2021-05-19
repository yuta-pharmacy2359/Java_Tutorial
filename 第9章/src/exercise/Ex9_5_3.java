package exercise;

import lib.Input;

public class Ex9_5_3 {
	public static void main(String[] args) {
		int n = Input.getInt("西暦");
		boolean b1 = (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
		System.out.print("西暦" + n + "年は閏年である --> " + b1);
	}
}
