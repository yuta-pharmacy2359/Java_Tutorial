package exercise;

import lib.Input;

public class Ex6_3_2 {
	public static void main(String[] args) {
		int x = Input.getInt();
		int s = x % 12;
		System.out.println("12で割った余り=" + s);
	}
}
