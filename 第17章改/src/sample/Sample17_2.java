package sample;

public class Sample17_2 {
	public static void main(String[] args) {
		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
		System.out.println(s1);
		System.out.println("売上額=" + s1.amount());
	}
}
