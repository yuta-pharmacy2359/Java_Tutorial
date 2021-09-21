package exercise;

public abstract class Calculation {
	private double[] dt;

	protected Calculation(double[] dt) {
		this.dt = dt;
	}

	public double[] getDt() {
		return dt;
	}

	public abstract double total();
}
