package exercise;
import lib.Input;

public class Ex12_1_1 {
	public static void main(String[] args) {
		int s = Input.getInt();
		switch (s) {
			case 10 -> System.out.println("ハンバーガー");
			case 11 -> System.out.println("ポテトフライ");
			case 51 -> System.out.println("バニラシェーク");
			case 52 -> System.out.println("コーラ");
			case 60, 61 -> System.out.println("セットメニュー");
			default -> System.out.println("入力エラー");
		}
	}
}
