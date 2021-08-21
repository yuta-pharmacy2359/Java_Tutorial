package exercise;
import lib.Input;

public class Ex11_1_5 {
	public static void main(String[] args) {
		int n = Input.getInt();
		if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			System.out.println("閏年です");
		} else {
			System.out.println("閏年ではありません");
		}
	}
}