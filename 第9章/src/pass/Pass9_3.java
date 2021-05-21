package pass;

import lib.Input;

public class Pass9_3 {
	public static void main(String[] args) {
		String str1 = Input.getString();
		String str2 = str1.equals("OK") || str1.equals("ok") ? "おめでとう！" : "残念！";
		System.out.println(str2);
	}
}
