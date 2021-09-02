package sample;

import bit.Bit;
import lib.Input;

public class Sample14_4 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		Bit.println("a= ", a);
		a <<= 3;
		Bit.println("a= ", a);
	}
}
