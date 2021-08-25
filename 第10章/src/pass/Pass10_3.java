package pass;
import lib.Input;

public class Pass10_3 {
	public static void main(String[] args) {
		double dbl;
		int ken = 0;
		while((dbl = Input.getDouble()) != 0) {
			ken += dbl >= 10 ? 1 : 0;
		}
		System.out.println("件数=" + ken);
	}
}
