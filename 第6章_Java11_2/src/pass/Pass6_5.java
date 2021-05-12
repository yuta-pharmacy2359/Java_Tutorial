package pass;

import lib.Input;

public class Pass6_5 {
	public static void main(String[] args) {
		String str1 = Input.getString("文字列");
		System.out.printf("文字数=%d%n", str1.length());
		System.out.printf("先頭から5文字=%s%n", str1.substring(0, 5));
		System.out.printf("先頭から7文字目=%s%n", str1.charAt(6));
		System.out.printf("str2=%s%n", str1.replace("5", "0"));
		System.out.printf("str3=%s%n", str1.toUpperCase());
	}
}
