package exercise;

public class Ex12_4_1 {
	public static void main(String[] args) {
		double[] data = { 2.5, 3.3, 7.0, -4.5, 5.2 };
		for(double dt : data) {
			if(dt < 0) {
				System.out.println("不正なデータ:" + dt);
				break;
			}
			System.out.printf("%4.2f%n", Math.sqrt(dt));
		}
	}
}
