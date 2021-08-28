package pass;

public class Pass12_3 {
	public static void main(String[] args) {
		double[] val = { 1.5, -12, 3.8, -12.0, -25.1, 32, 0.812, 25, 33 };
		for(double value : val) {
			if(value < 0) {
				continue;
			} else if(value < 1 || value > 100) {
				break;
			}
			System.out.printf("%3.1f\t", value);
			System.out.println(Math.sqrt(value));
		}
	}
}
