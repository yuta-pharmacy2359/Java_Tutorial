package pass;

public class Pass8_2 {
	public static void main(String[] args) {
		String[] name = {"田中", "中村", "鈴木", "山本", "本田"};
		double[] score = {82.0, 85.0, 74.0, 90.0, 70.0};
		double tot = 0;
		for(String str : name) {
			System.out.print(str + "\t");
		}
		System.out.println("平均");
		for(double dbl : score) {
			tot += dbl;
			System.out.print(dbl + "\t");
		}
		double avg = tot / score.length;
		System.out.println(avg);
	}
}
