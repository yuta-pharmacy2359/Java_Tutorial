package exercise;

import lib.Input;
import sample.MyTools;

public class Ex15_1_4 {
	public static void main(String[] args) {
		String str, cent = "";
		while((str = Input.getString()) != null) {
			String s = MyTools.padding(str, 10);
			cent += s;
		}
		System.out.println(cent);
	}
}