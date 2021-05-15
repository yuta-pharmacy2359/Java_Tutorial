package sample;

public class Sample8_4 {
	public static void main(String[] args) {
		double[] data = {1.25, 0.85, 3.2, 4.11, 0.56, 7.6};
		double total = 0;
		for(int i = 0; i < data.length; i++) {
			total += data[i];
		}
		System.out.println("合計=" + total);
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
	}
}
