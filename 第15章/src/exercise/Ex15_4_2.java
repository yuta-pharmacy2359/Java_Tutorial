package exercise;

import java.util.Arrays;

import sample.MyTools;

public class Ex15_4_2 {
	public static void main(String[] args) {
		int[] n = {15, 11, 25, 7, 18, 3};
		int max = MyTools.max2(n);
		System.out.println("最大値=" + max);
		System.out.println(Arrays.toString(n));
	}
}