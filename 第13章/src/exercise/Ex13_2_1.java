package exercise;
import lib.Input;

public class Ex13_2_1 {
	public static void main(String[] args) {
		int len;
		while((len = Input.getInt()) != 0) {
			double[] data = new double[len];
			for(double x : data) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
