package pass;

import lib.Input;

public class Pass8_4 {
	public static void main(String[] args) {
		String str = Input.getString("String");
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
