package sample;

public class Sample13_8 {
	public static void main(String[] args) {
		int[][] drink = {
				{100, 150, 280, 220},
				{120, 200, 250, 210}
		};
		for(int[] row : drink) {
			for(int n : row) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}
}
