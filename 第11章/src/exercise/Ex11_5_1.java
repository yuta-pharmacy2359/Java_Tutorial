package exercise;
import lib.Input;

public class Ex11_5_1 {
	public static void main(String[] args) {
		String str;
		while((str = Input.getString()) != null) {
			if(str.equals("passwd")) {
				System.out.println("ようこそ！");
			} else {
				System.out.println("パスワードが違います");
			}
		}
	}
}
