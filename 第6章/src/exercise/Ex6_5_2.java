package exercise;

import lib.Input;

public class Ex6_5_2 {
	public static void main(String[] args) {
		double height = Input.getDouble("身長");
		double weight = Input.getDouble("体重");
		System.out.println("身長=" + height + "cm");
		System.out.println("体重=" + weight + "kg");
	}
}
