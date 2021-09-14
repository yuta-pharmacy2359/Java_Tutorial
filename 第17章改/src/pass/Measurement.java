package pass;

import lib.Input;

public class Measurement {
	private double weight;
	private double height;
	public Measurement(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double bmi() {
		return weight / Math.pow(height / 100, 2);
	}
	public double stdWeight() {
		return (height - 100) * 0.9;
	}
	@Override
	public String toString() {
		return "Measurement [weight=" + weight + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		Measurement val = new Measurement(Input.getDouble("体重kg"), Input.getDouble("身長cm"));
		System.out.println(val);
		System.out.printf("BMI=%.2f%n", val.bmi());
		System.out.printf("標準体重=%.2f", val.stdWeight());
	}
}
