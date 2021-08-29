package exercise;

public class Ex13_6_2 {
	public static void main(String[] args) {
		double[][] data = new double[3][2];
		for(double[] row : data) {
			for(double n : row) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}
}
