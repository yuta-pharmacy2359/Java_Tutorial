package pass;

import bit.Bit;

public class Pass14_3 {
	public static void main(String[] args) {
		Bit.println(0b00001111 >> 2);
		Bit.println(0b11110101 >> 2);
		Bit.println(0b11110101 >>> 2);
		Bit.println(0b11110000 << 2);
		Bit.println(0b00001111 & 0b00000011);
		Bit.println(0b11110000 | 0b00000011);
		Bit.println(0b11111111 ^ 0b00110011);
		Bit.println(~0b10011001);
	}
}
