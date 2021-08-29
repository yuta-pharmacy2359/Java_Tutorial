package exercise;

public class Ex13_1_1 {
	public static void main(String[] args) {
		double[] dbl = new double[5];
		boolean[] bln = new boolean[8];
		String[] str = new String[3];
		for(int i = 0; i < dbl.length; i++) {
			System.out.print(dbl[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < bln.length; i++) {
			System.out.print(bln[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
