package sample;

public class Sample12_7 {
	public static void main(String[] args) {
		int[] data = { 81, 92, 33, 101, 56, 22 };
		exit:for(int i = 0; i < 2; i++) {
			for(int n : data) {
				if(n > 100) {
					break exit;
				}
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
