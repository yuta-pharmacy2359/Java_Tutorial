package exercise;

public class Ex11_5_4 {
	public static void main(String[] args) {
		int[] data = { 22, 13, 16, 3, 4, 31, 28, 8, 10 };
		int max = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.println("最大値=" + max);
	}
}
