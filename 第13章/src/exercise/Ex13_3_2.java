package exercise;
import lib.Input;

public class Ex13_3_2 {
	public static void main(String[] args) {
		String[] str = new String[3];
		for(int i = 0; i < str.length; i++) {
			str[i] = Input.getString();
		}
		for(String s : str) {
			System.out.print(s + " ");
		}
	}
}