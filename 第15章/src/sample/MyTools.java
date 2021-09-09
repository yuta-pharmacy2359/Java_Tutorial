package sample;

import java.util.Arrays;

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

	public static void newLine() {
		System.out.println();
	}

	public static void stdWeight(double height) {
		System.out.println("標準体重=" + (height - 100) * 0.9);
	}

	public static int sum(int[] data) {
		return Arrays.stream(data).sum();
	}

	public static int max(int[] data) {
		Arrays.sort(data);
		return data[data.length - 1];
	}

	public static int max2(int[] data) {
		int max = 0;
		for(int n : data) {
			if(max < n) {
				max = n;
			}
		}
		return max;
	}
}
