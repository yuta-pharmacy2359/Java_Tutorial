package sample;

public class Sample8_3 {
	public static void main(String[] args) {
		int[] data = {10, 20, 30, 40, 50, 60};
		int total = 0;
		for(int i = 0; i < data.length; i++) {
			total += data[i];
		}
		System.out.println("合計=" + total);
	}
}
