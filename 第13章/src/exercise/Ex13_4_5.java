package exercise;
import java.util.Arrays;

public class Ex13_4_5 {
	public static void main(String[] args) {
		double[] data = {2.8, -3.3, 1.5, -5.2, 4.2, 8.1};
		double total = Arrays.stream(data)
								.filter(n -> n > 0)
								.sum();
		System.out.println("合計=" + total);
	}
}