package exercise;

public class Ex7_2_1 {
	public static void main(String[] args) {
		double[] data = {0.5, 2.5, 3.5};
		double d1, d2, d3;
		d1 = data[0] + data[1];
		d2 = data[2] / data[0];
		d3 = (data[0] + data[1] + data[2]) / 0.5;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
