package sample;

public class MyTools {
	public static double bmi(double weight, double height) {
		double value = weight / Math.pow(height, 2);
		return value;
	}

	public static int calconv(String nengo, int wareki) {
		int seireki = switch(nengo) {
			case "M", "m" -> wareki + 1867;
			case "T", "t" -> wareki + 1911;
			case "S", "s" -> wareki + 1925;
			case "H", "h" -> wareki + 1988;
			case "R", "r" -> wareki + 2018;
			default -> wareki;
		};
		return seireki;
	}

	public static String padding(String word, int len) {
		String s;
		if(word.length() < len) {
			s = word + " ".repeat(len - word.length());
		} else {
			s = word;
		}
		return s;
	}
}
