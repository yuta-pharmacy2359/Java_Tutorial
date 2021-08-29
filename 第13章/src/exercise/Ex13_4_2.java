package exercise;
import java.util.Arrays;

import lib.Input;

public class Ex13_4_2 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.sort(words);
		String str;
		while((str = Input.getString()) != null) {
			int pos = Arrays.binarySearch(words, str);
			System.out.println("検索結果=" + pos);
		}
	}
}
