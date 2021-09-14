package sample;

import java.util.Arrays;

public class Stat {
	private double[] x;
	public Stat(double[] x) {
		this.x = x;
	}
	public Stat(int size) {
		x = new double[size];
	}
	public Stat() {
		this(100);
	}
	public double sum() {
		return Arrays.stream(x).sum();
	}
	public double mean() {
		return sum() / x.length;
	}
	public double get(int i) {
		return x[i];
	}
	public void set(int i, double a) {
		x[i] = a;
	}
}
