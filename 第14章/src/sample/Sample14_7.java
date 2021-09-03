package sample;

import bit.Bit;
import lib.Input;

public class Sample14_7 {
	public static void main(String[] args) {
		Bit.noSpace();
		byte data = Input.getBin();

		data |= 0b00000100;
		data &= 0b11011111;
		Bit.println("-->", data);
	}
}
