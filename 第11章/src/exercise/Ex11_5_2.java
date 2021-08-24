package exercise;
import lib.Input;

public class Ex11_5_2 {
	public static void main(String[] args) {
		char ch;
		int a = 0, b = 0, c = 0;
		while((ch = Input.getChar()) != 0) {
			if(ch == 'a') {
				a++;
			} else if(ch == 'b') {
				b++;
			} else if(ch == 'c') {
				c++;
			}
		}
		System.out.println("a: " + a + "\n" + "b: " + b + "\n" + "c: " + c);
	}

}
