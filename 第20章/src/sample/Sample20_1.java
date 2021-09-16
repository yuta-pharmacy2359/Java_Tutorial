package sample;

public class Sample20_1 {
	public static void main(String[] args) {
		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
		System.out.println(s1);
		test(s1);
		System.out.println(s1);
	}
	public static void test(Sales sales) {
		sales.setQuantity(50);
	}
}