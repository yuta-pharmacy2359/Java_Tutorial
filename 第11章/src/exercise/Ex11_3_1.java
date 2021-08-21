package exercise;

import lib.Input;

public class Ex11_3_1 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if(n == 1) {
			System.out.println("賛成");
		} else if(n == 2) {
			System.out.println("反対");
		} else if(n == 3) {
			System.out.println("棄権");
		} else {
			System.out.println("無効");
		}
	}
}
