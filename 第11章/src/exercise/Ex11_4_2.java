package exercise;
import lib.Input;

public class Ex11_4_2 {
	public static void main(String[] args) {
		double distance = Input.getDouble("距離");
		int fee;
		if(distance < 7) {
			fee = 170;
		} else if(distance >= 12) {
			fee = 200;
		} else if(distance >= 20) {
			fee = 240;
		} else {
			fee = 310;
		}
		System.out.println("運賃は" + fee + "円です");
	}
}