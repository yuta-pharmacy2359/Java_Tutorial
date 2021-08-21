package exercise;
import lib.Input;

public class Ex11_1_4 {
	public static void main(String[] args) {
		char ch = Input.getChar();
		if(Character.isDigit(ch)) {
			System.out.println("数字です");
		} else {
			System.out.println("数字ではありません");
		}
	}
}
