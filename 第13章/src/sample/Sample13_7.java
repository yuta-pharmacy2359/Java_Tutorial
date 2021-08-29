package sample;
import java.util.Arrays;

public class Sample13_7 {
	public static void main(String[] args) {
		int[][] drink = {
				 {100, 150, 280, 220},
				 {120, 200, 250, 210}
		};
		for(int[] row : drink) {
			System.out.println(Arrays.toString(row));
		}
	}
}
