package sample;

import bit.Bit;
import lib.Input;

public class Sample14_5 {
	public static void main(String[] args) {
		byte a = Input.getBin("a");
		byte b = Input.getBin("b");

		Bit.println("a & b = ", a & b);
		Bit.println("a | b = ", a | b);
		Bit.println("a ^ b = ", a ^ b);
		Bit.println("   ~a = ", ~a   );
	}
}
