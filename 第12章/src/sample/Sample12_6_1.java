package sample;

public class Sample12_6_1 {
	public static void main(String[] args) {
		int[] data = { 81, 92, 33, 101, 56, 22 };
		for(int i = 0; i < 2; i++) {
			for(int n : data) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
