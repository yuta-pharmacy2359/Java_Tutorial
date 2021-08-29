package exercise;
import lib.Input;

public class Ex13_3_1 {
	public static void main(String[] args) {
		double[] number = new double[5];
		for(int i = 0; i < number.length; i++) {
			number[i] = Input.getDouble();
		}
		for(double n : number) {
			System.out.print(n + " ");
		}
	}
}
