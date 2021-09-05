package exercise;

import lib.Input;
import sample.MyTools;

public class Ex15_2_1 {
	public static void main(String[] args) {
		double h = Input.getDouble("身長(cm)");
		MyTools.stdWeight(h);
	}
}