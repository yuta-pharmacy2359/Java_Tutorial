package exercise;

public class Ex5_3 {
	public static void main(String[] args) {
		String s1 = "xy" + 3;
		System.out.println(s1);

		String s2 = 3 + "xy";
		System.out.println(s2);

		String s3 = 3 + "xy" + 5;
		System.out.println(s3);

		String s4 = "xy" + (3 + 5);
		System.out.println(s4);

		String s5 = 3 + 5 + "xy";
		System.out.println(s5);
	}
}
