package sample;
import lib.Input;

public class Sample11_5 {
	public static void main(String[] args) {
		int sansei = 0, hantai = 0, n;
		while((n = Input.getInt()) != 0) {
			if(n == 1) {
				sansei++;
			} else {
				hantai++;
			}
		}
		System.out.println("賛成=" + sansei);
		System.out.println("反対=" + hantai);
	}
}