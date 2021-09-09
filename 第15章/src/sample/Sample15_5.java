package sample;

import java.util.Arrays;

public class Sample15_5 {
	public static void main(String[] args) {
		int[] data = {15, 11, 25, 7, 18, 3};
		int[] temp = data;
		temp[0] = 100;
		System.out.println("data=" + Arrays.toString(data));
		System.out.println("temp=" + Arrays.toString(temp));
	}
}
