package pass;
import lib.Input;

public class Pass10_5 {
	public static void main(String[] args) {
		int n;
		double ran;
		do {
			System.out.println(ran = Math.random());
		} while((n = Input.getInt("[int]")) != 0);
	}
}
