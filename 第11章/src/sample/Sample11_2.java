package sample;
import lib.Input;

public class Sample11_2 {
	public static void main(String[] args) {
		double x = Input.getDouble();
		if(x < 0) {
			x *= -1;
		}
		System.out.println(x + "の平方根=" + Math.sqrt(x));
	}
}
