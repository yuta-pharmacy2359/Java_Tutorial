package pass;

public class Pass9_1 {
	public static void main(String[] args) {
		int n = 18;
		char c = 'A';
		double x = 3.14;
		String s = "Hello";

		boolean b1 = n >= 100;
		boolean b2 = n >= 100 && n < 500;
		boolean b3 = n % 2 == 0;
		boolean b4 = (n % 3 == 0 || n % 2 != 0) && n < 100;
		boolean b5 = c > 't' + 1;
		boolean b6 = Math.sqrt(x) > 2.0;
		boolean b7 = s != "abc";

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		System.out.println("b7 = " + b7);
	}
}
