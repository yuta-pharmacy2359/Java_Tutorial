package sample;

import lib.Input;

public class Sample15_7 {
	public static void main(String[] args) {
		String me = Input.getString().toUpperCase();
		String com = computer();
		String result = judge(me + com);
		System.out.println(me + ":" + com + "-->" + result);
	}

	public static String computer() {
		double ran = Math.random();
		if(ran <= 0.33) {
			return "G";
		} else if(ran <= 0.66) {
			return "C";
		} else {
			return "P";
		}
	}

	public static String judge(String s) {
		String result = switch (s) {
			case "GG", "CC", "PP" -> "引き分け";
			case "GC", "CP", "PG" -> "勝ち";
			default -> "負け";
		};
		return result;
	}
}
