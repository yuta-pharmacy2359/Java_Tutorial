package sample;

import bit.Bit;
import lib.Input;

public class Sample14_2 {
	public static void main(String[] args) {
		byte a = Input.getHex();
		Bit.println(a);
		for(int i = 0; i <= 8; i++) {
			Bit.println(a >>> i);
		}
	}
}
