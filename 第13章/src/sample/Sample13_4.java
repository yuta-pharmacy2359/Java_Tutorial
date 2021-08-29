package sample;
import java.util.Arrays;

import lib.Input;

public class Sample13_4 {
	public static void main(String[] args) {
		int[] number = { 18, 21, 33, 55, 90 };
		int key = Input.getInt("検索値");
		int pos = Arrays.binarySearch(number, key);
		System.out.print("検索結果" + pos);
	}
}
