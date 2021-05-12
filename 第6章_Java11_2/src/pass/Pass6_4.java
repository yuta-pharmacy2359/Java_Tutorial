package pass;

import lib.Input;

public class Pass6_4 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");
		int c = Input.getInt("c");
		int d = Math.max(a, b);
		int e = Math.max(c, d);

		System.out.printf("a,b,cの中の最大値=%d", e);
	}
}
