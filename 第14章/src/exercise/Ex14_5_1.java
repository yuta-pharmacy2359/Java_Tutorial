package exercise;

import bit.Bit;
import lib.Input;

public class Ex14_5_1 {
	public static void main(String[] args) {
		Bit.noSpace();
		byte data = Input.getBin();

		data |= 0b01100000;
		data &= 0b11111101;
		Bit.println("-->", data);
	}
}
