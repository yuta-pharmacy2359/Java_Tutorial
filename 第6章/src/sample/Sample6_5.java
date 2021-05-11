package sample;

public class Sample6_5 {
	public static void main(String[] args) {
		String str = "abAB日本語ａｂ";

		char ch = str.charAt(4);
		int pos = str.indexOf('日');
		int len = str.length();
		String s = str.toLowerCase();

		System.out.println("4番目の文字は" + ch);
		System.out.println("日は" + pos + "番目");
		System.out.println("長さ=" + len);
		System.out.println(str + "→" + s);
	}
}
