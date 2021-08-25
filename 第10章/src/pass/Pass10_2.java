package pass;
import lib.Input;

public class Pass10_2 {
	public static void main(String[] args) {
		int ken = 0;
		double dbl, total = 0;
		while((dbl = Input.getDouble()) != 0) {
			total += dbl;
			ken++;
		}
		System.out.printf("合計=%6.2f%n", total);
		System.out.println("件数=  " + ken);
		System.out.printf("平均=%6.2f%n", total / ken);
	}
}
