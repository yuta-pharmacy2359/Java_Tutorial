package pass;

import java.util.Arrays;

import sample.MyTools;

public class Pass15_4 {
	public static void main(String[] args) {
		double[] x = {23.8, 26.8, 24.3, 24.6, 24.9, 24.1, 20.8};
		System.out.println(Arrays.toString(x));
		System.out.println("SD = " + MyTools.sd(x));
	}
}
