package exercise;
import lib.Input;

public class Ex11_1_2 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if(n % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}
}
