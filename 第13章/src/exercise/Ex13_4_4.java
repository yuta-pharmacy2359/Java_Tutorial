package exercise;
import java.util.Arrays;

public class Ex13_4_4 {
	public static void main(String[] args) {
		double[] data = new double[5];
		Arrays.fill(data, 5.1);
		double[] dataCopy = Arrays.copyOf(data, 10);
		System.out.println(Arrays.toString(dataCopy));
	}
}
