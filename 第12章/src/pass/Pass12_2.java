package pass;
import lib.Input;

public class Pass12_2 {
	public static void main(String[] args) {
		int month;
		while((month = Input.getInt("月")) != 0) {
			String season = switch(month) {
				case 12, 1, 2 -> "冬";
				case 3, 4, 5 -> "春";
				case 6, 7, 8 -> "夏";
				case 9, 10, 11 -> "秋";
				default -> "入力エラー";
			};
			System.out.println("季節は" + season + "です");
		}
	}
}
