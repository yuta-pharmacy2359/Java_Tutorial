package exercise;
import lib.Input;

public class Ex12_2_1 {
	public static void main(String[] args) {
		char ch;
		while((ch = Input.getChar()) != 0) {
			switch (ch) {
				case 'J' :
				case 'j' :
					System.out.println("Java言語");
					break;
				case 'C' :
				case 'c' :
					System.out.println("C言語");
					break;
				default :
					System.out.println("その他の言語");
			}
		}
	}
}