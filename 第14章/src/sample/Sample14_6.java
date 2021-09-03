package sample;

import bit.Bit;
import lib.Input;

public class Sample14_6 {
	public static void main(String[] args) {
		byte data = Input.getHex();

		int d = data & 0b00000100;
		System.out.println(d == 0 ? "OFF" : "ON");

		Bit.println("data = ", data);
		Bit.println("data & 0b00000100", d);
	}
}
