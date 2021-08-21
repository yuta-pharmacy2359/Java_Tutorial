package exercise;
import lib.Input;

public class Ex11_1_1 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if(n > 0) {
			System.out.println("正の数です");
		} else {
			System.out.println("正の数ではない");
		}
	}
}
