package exercise;

public class Ex8_3_1 {
	public static void main(String[] args) {
		int[] n = {31, 24, 12, 44, 61, 72, 18};
		double[] x = {20.1, 18.5, 22.8, 62.5};
		int total1 = 0;
		double total2 = 0;
		for(int i = 0; i < n.length; i++) {
			total1 += n[i];
		}
		System.out.println("n[]の合計=" + total1);
		for(int i = 0; i < x.length; i++) {
			total2 += x[i];
		}
		System.out.println("x[]の合計=" + total2);
	}
}
