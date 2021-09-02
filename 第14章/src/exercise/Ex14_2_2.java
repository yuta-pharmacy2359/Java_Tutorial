package exercise;

import bit.Bit;
import lib.Input;

public class Ex14_2_2 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		Bit.withHex();
		Bit.println("a    = ", a);
		a <<= 4;
		Bit.println("a<<4 = ", a);
		a >>= 2;
		Bit.println("a>>2 = ", a);
	}
}
