package exercise;

public class Ex8_2_2 {
	public static void main(String[] args) {
		double[] n = {2.5, 2.1, 1.8, 4.12, 3.15, 2.8};
		double total = 0;
		for(int i = 0; i < n.length; i++) {
			total += n[i];
		}
		System.out.println("合計=" + total);
	}
}
