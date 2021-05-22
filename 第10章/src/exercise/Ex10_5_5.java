package exercise;

import lib.Input;

public class Ex10_5_5 {
	public static void main(String[] args) {
		double dt;
		while((dt = Input.getDouble()) == 0) {
			System.out.println(dt);
		}
	}
}
