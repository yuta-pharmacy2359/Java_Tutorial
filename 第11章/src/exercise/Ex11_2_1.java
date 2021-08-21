package exercise;
import lib.Input;

public class Ex11_2_1 {
	public static void main(String[] args) {
		int nin = Input.getInt("人数"), fee = 850 * nin;
		if(nin >= 5) {
			fee *= 0.7;
		}
		System.out.println("入館料=" + fee);
	}
}