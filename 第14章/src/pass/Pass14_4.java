package pass;

import bit.Bit;
import lib.Input;

public class Pass14_4 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		int u1, u2;
		u1 = a >>> 4;
		u2 = a & 0b00001111;
		Bit.withHex();
		Bit.println("u1 = ", u1);
		Bit.println("u2 = ", u2);
	}
}
