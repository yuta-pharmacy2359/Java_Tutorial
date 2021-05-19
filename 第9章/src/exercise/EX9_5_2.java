package exercise;

public class EX9_5_2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		boolean b1 = !(a <= b + 5);
		boolean b2 = !(a == b);
		boolean b3 = a > 0 && b > 0;
		boolean b4 = a > 0 || b > 0;
		boolean b5 = !(a > b);
		boolean b6 = !(a > b) || b == 0;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}
