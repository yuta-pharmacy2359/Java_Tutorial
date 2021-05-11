package exercise;

public class Ex6_7_2 {
	public static void main(String[] args) {
		String str1 = "http://localhost:8080/index.html";
		String str2 = str1.replace("localhost", "k-webs.jp");
		String str3 = str2.substring(7, 13);

		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		System.out.println("str3=" + str3);
	}
}
