package exercise;
import lib.Input;

public class Ex12_3_1 {
	public static void main(String[] args) {
		int n;
		while((n = Input.getInt("製品番号")) != 0) {
			String product = switch (n) {
				case 100 -> "イチゴ";
				case 110 -> "パイン";
				case 120 -> "メロン";
				default -> "??";
			};
			System.out.println(product);
		}
	}
}