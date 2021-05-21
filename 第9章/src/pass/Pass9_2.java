package pass;

public class Pass9_2 {
	public static void main(String[] args) {
		int a = 0, b = 1;
		boolean b1 = a != b;
		//boolean b2 = a && b == 0;
		boolean b3 = a == 1 || b == 1;
		boolean b4 = a > 0 && a < 10 || a <= b;
		//boolean b5 = !a && !b;
		boolean b6 = Math.pow(a, 2) > 10 || a < 0;
		boolean b7 = a + b == 1 ^ a * b == 0;

		System.out.println("b1 = " + b1);
		//System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		//System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		System.out.println("b7 = " + b7);
	}
}
