package sample;
import java.util.Arrays;

public class Sample13_5 {
	public static void main(String[] args) {
		int[] number = new int[5];
		Arrays.fill(number, 3);
		int[] numberCopy = Arrays.copyOf(number, 12);
		System.out.print(Arrays.toString(numberCopy));
	}
}
