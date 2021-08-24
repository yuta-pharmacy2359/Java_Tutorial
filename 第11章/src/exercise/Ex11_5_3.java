package exercise;

public class Ex11_5_3 {
	public static void main(String[] args) {
		double[] data = { 11.2, 21.8, 32.2, 31.5, 10.2, 23.4 };
		int count = 0;
		for(double dt : data) {
			if(dt > 25) {
				count++;
			}
		}
		System.out.println("個数=" + count);
	}

}
