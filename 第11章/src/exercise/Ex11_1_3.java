package exercise;
import lib.Input;

public class Ex11_1_3 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if(n >= 3 && n <= 7) {
			System.out.println("範囲内です");
		} else {
			System.out.println("範囲外です");
		}
	}
}
