package sample;

public class Sample6_6 {
	public static void main(String[] args) {
		String str1 = "a".repeat(5);
		String str2 = "こんにちは太郎さん".replace("太郎", "花子");
		String str3 = "123456789".substring(3, 6);
		String str4 = "  Hello  ".trim();

		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		System.out.println("str3=" + str3);
		System.out.println("str4=" + str4 + "[" + str4.length() + "]");
	}
}
