package exercise;

public class Ex5_10_5 {
	public static void main(String[] args) {
		int n = 123;
		double x = n + 1;
		int k = (int)x;
		long ln = (long)x;
		char c1 = 123;
		char c2 = (char)n;
		short s = (short)c1;
		byte b = (byte)c1;
		c1 = (char)s;
		c1 = (char)b;
		System.out.println("k=" + k + ", b=" + b + ", c1=" + c1 + ", c2=" + c2 + ", ln=" + ln);
	}
}
