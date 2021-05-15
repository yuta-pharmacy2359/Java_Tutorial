package exercise;

public class Ex8_2_1 {
	public static void main(String[] args) {
		int[] n = {13, 22, 14, 8, 31, 52, 17, 18};
		int total = 0;
		for(int i = 0; i < n.length; i++) {
			total += n[i];
		}
		System.out.println("合計=" + total);
	}
}
