package sample;

import lib.Input;

public class Sample6_3 {
	public static void main(String[] args) {
		double x = Input.getDouble();
		double s = Math.pow(x, 2);
		System.out.println("正方形の面積" + s);
	}
}
