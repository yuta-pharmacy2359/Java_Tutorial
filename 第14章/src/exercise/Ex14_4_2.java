package exercise;

import bit.Bit;
import lib.Input;

public class Ex14_4_2 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		byte b = Input.getHex();
		int c = a ^ b;
		int d = (~a & b) | (a & ~b);
		Bit.printlnH("a ^ b =", c);
		Bit.printlnH("(~a & b) | (a & ~b) =", d);
	}
}
