package exercise;
import java.util.Arrays;

public class Ex13_4_1 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.stream(words)
				.sorted()
				.forEach(str -> System.out.println(str));
	}
}
