package sample;

import bit.Bit;
import lib.Input;

public class Sample14_0 {
	public static void main(String[] args) {
		Bit.println(171);
		Bit.printlnH(171);

		byte b = Input.getHex();
		Bit.println(b);

		byte b2 = Input.getBin();
		Bit.println("b=", b2);
	}
}