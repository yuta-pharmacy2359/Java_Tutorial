package exercise;
import java.util.Arrays;

public class Ex13_4_3 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.stream(words)
				.distinct()
				.sorted()
				.forEach(str -> System.out.println(str));
	}
}
