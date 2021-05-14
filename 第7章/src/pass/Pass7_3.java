package pass;

public class Pass7_3 {
	public static void main(String[] args) {
		int[] i1 = {102, 98, 122, -97};
		double[] d1 = {12.5, 33.5, -12.7, 18.4, 13.33};
		String[] s1 = {"赤", "青", "黄", "白", "黒", "紫"};
		for(int i = 0; i < 4; i++) {
			System.out.print(i1[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.print(d1[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < 6; i++) {
			System.out.print(s1[i] + "\t");
		}
		System.out.println();
	}
}
