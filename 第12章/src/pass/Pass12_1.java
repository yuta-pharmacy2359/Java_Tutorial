package pass;
import lib.Input;

public class Pass12_1 {
	public static void main(String[] args) {
		String code;
		while((code = Input.getString("商品コード")) != null) {
			int price = switch (code) {
				case "a100" -> 100;
				case "a110" -> 200;
				case "b100" -> 100;
				case "b110" -> 200;
				case "b120" -> 200;
				case "c100" -> 300;
				case "c110" -> 300;
				case "d100" -> 400;
				default -> 0;
			};
			if(price == 0) {
				System.out.println("商品コードが間違っています");
			} else {
				int n = Input.getInt("商品の数量");
				int total = price * n;
				System.out.println("合計金額=" + total);
			}
		}
	}
}
