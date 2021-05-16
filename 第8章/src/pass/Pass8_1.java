package pass;

public class Pass8_1 {
	public static void main(String[] args) {
		double[] data = {12.3, 13.5, 11.5, 13.0, 12.8, 12.5};
		double sum = 0;
		for(double n : data) {
			sum += n;
		}
		double avg = sum / data.length;
		System.out.println("合計=" + sum);
		System.out.println("平均=" + avg);
		for(double n : data) {
			System.out.print(n + "  ");
		}
	}
}
