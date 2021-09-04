package pass;

import bit.Bit;
import lib.Input;

public class Pass14_5 {
	public static void main(String[] args) {
		byte u1 = Input.getHex();
		byte u2 = Input.getHex();
		int t1, t2;
		t1 = (u1 & 0b00001111) | (u2 & 0b11110000);
		t2 = (u1 & 0b11110000) | (u2 & 0b00001111);
		Bit.withHex();
		Bit.println("u1 = ", u1);
		Bit.println("u2 = ", u2);
		Bit.println("t1 = ", t1);
		Bit.println("t1 = ", t2);
	}
}