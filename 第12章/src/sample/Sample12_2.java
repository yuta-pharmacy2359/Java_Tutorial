package sample;
import lib.Input;

public class Sample12_2 {
	public static void main(String[] args) {
		int n;
		while((n = Input.getInt()) != 0) {
			switch (n) {
				case 10 :
					System.out.println("正常終了");
					break;
				case 20 :
				case 21 :
					System.out.println("エラー発生");
					break;
				default :
					System.out.println("未定義");
			}
		}
	}
}
