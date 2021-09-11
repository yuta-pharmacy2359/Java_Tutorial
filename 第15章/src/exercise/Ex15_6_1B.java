package exercise;

public class Ex15_6_1B {
	public static void main(String[] args) {
		int[] a = {100, 120, 140};
		int[] b = {65, 80, 105};
		print(a);
		print(b);
	}

	public static void print(int[] n) {
		for(int num : n) {
			System.out.printf("%5d", num);
		}
		System.out.println();
	}
}