package exercise;

import lib.Input;

public class Ex11_3_3 {
	public static void main(String[] args) {
		String greet = Input.getString();

		if(greet.equals("おはよう")) {
			System.out.println("Good morning.");
		} else if(greet.equals("こんばんは")) {
			System.out.println("Good evening.");
		} else {
			System.out.println("Hello.");
		}
	}
}