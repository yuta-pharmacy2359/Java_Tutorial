package exercise;

import lib.Input;

public class Exchanger {
	private double yen;
	public Exchanger(double yen) {
		this.yen = yen;
	}
	public double toDollar() {
		return yen / 106;
	}
	public double getYen() {
		return yen;
	}
	public void setYen(double yen) {
		this.yen = yen;
	}
	public static void main(String[] args) {
		Exchanger yen = new Exchanger(Input.getDouble("円"));
		System.out.print("¥" + yen.getYen() + "=");
		System.out.printf("$%.1f", yen.toDollar());
	}
}