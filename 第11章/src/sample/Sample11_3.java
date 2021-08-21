package sample;
import lib.Input;

public class Sample11_3 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if(n == 1) {
			System.out.println("賛成");
		} else if(n == 2) {
			System.out.println("反対");
		} else {
			System.out.println("無効");
		}
	}
}
