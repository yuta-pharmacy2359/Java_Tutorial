package sample;

public class Sample16_3 {
	public static void main(String[] args) {
		Sales s1 = new Sales("SY-200", "冷蔵庫", 50000, 20, true);
		System.out.println(s1.getCode());
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
		System.out.println(s1.getQuantity());
		System.out.println(s1.isStock());
	}
}
