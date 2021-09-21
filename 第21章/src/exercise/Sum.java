package exercise;

public class Sum extends Calculation {

	public Sum(double[] dt) {
		super(dt);
	}

	@Override
	public double total() {
		double[] temp = getDt();
		double gt = 0;
		for(double n : temp) {
			gt += n;
		}
		return gt;
	}
}
