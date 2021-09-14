package sample;

public class Sample17_10 {
	public static void main(String[] args) {
		double[] data = {2.8, 1.5, 5.4, 8.2, 3.5};
		Stat st1 = new Stat(data);
		System.out.println("合計=" + st1.sum());
		Stat st2 = new Stat(5);
		for(int i = 0; i < 5; i++) {
			st2.set(i, i);
		}
		System.out.println("合計=" + st2.sum());
	}
}
