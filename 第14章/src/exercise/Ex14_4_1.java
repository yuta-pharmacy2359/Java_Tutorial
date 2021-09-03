package exercise;

import bit.Bit;
import lib.Input;

public class Ex14_4_1 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		byte b = Input.getHex();
		int c = a ^ b;
		Bit.withHex();
		Bit.println("a =", a);
		Bit.println("b =", b);
		Bit.println("c =", c);
		System.out.println();
		Bit.println("a ^ c =", a ^ c);
		Bit.println("b ^ c =", b ^ c);
	}
}
