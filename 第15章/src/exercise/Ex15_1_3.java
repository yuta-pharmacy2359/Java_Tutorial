package exercise;

import lib.Input;
import sample.MyTools;

public class Ex15_1_3 {
	public static void main(String[] args) {
		String a = Input.getString("年号");
		int b = Input.getInt("和暦年");
		int c = MyTools.calconv(a, b);
		System.out.println("西暦年=" + c);
	}
}
