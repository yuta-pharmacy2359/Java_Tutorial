package exercise;

public class Ex6_7_1 {
	public static void main(String[] args) {
		String str1 = "  Hello  ";
		String str2 = str1.trim();
		String str3 = str2.repeat(3);

		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		System.out.println("str3=" + str3);
	}
}
