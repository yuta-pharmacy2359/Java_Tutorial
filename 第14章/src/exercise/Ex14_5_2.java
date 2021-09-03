package exercise;

import bit.Bit;
import lib.Input;

public class Ex14_5_2 {
	public static void main(String[] args) {
		Bit.noSpace();
		byte data = Input.getBin();

		data ^= 0b00001111;
		Bit.println("-->", data);
	}
}