package pass;

import sample.Sales;

public class Pass20_2 {
	public static void test(final Sales s) {
		s.setQuantity(50);
	}
	public static void main(String[] args) {
		Sales s = new Sales("", "", 1000, 25, true);
		test(s);
		System.out.println(s.getQuantity());
	}
}
