package exercise;

import lib.Input;

public class Ex10_2_2 {
	public static void main(String[] args) {
		String str;
		while((str = Input.getString("String")) != null) {
			System.out.println("こんにちは" + str + "さん");
		}
	}
}
