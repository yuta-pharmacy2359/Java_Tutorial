package pass;
import java.util.Arrays;

public class Pass13_2_1 {
	public static void main(String[] args) {
		double[] temp = {20.5, 23.4, 26.1, 28.5, 33.5, 29.1};
		Arrays.sort(temp);
		for(double n : temp) {
			System.out.print(n + "  ");
		}
	}
}
