package sample;
import java.util.Arrays;

public class Sample13_6 {
	public static void main(String[] args) {
		int[] number = { 55, 21, 90, 18, 33 };
		Arrays.stream(number)
				.filter(n -> n > 30)
				.sorted()
				.forEach(n -> System.out.println(n));
	}
}
