package exercise;

public class Ex6_6_1 {
	public static void main(String[] args) {
		String str = "ダウンロード：Eclipse IDE for Java Developers";
		char ch = str.charAt(5);
		int len = str.length();
		int ind = str.indexOf("J");
		String s = str.toLowerCase();

		System.out.println("5番目の文字は" + ch);
		System.out.println("長さ=" + len);
		System.out.println("Jは" + ind + "番目");
		System.out.println(s);
	}
}
