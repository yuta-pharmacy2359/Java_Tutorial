package exercise;

import lib.Input;

public class Ex17_3_2 {
	public static void main(String[] args) {
		Exchanger yen = new Exchanger(Input.getDouble("円"));
		System.out.print("¥" + yen.getYen() + "=");
		System.out.printf("$%.1f", yen.toDollar());
	}
}
