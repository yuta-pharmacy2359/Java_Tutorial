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

	public static double triangle(double a) {
		return Math.sqrt(3) * Math.pow(a, 2) / 4;
	}

	public static double triangle(double a, double b) {
		return a * b / 2;
	}

	public static double triangle(double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static double mileToKm(double mile) {
		double km = mile * 1.609344;
		return km;
	}

	public static double kmToMile(double km) {
		double mile = km / 1.609344;
		return mile;
	}

	public static double sd(double[] x) {
		double avg = Arrays.stream(x).sum() / x.length;
		double sum = 0;
		for(int i = 0; i < x.length; i++) {
			double cal = Math.pow(x[i] - avg, 2);
			sum += cal;
		}
		return Math.sqrt(sum / x.length);
	}

	public static void graph(int[] ch) {
		for(int n : ch) {
			drow(n);
			newLine();
		}
	}

	public static void drow(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("#");
		}
	}
}
