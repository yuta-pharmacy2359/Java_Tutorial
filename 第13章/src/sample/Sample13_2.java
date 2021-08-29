package sample;
import lib.Input;

public class Sample13_2 {
	public static void main(String[] args) {
		int[] number = new int[3];
		for(int i = 0; i < number.length; i++) {
			number[i] = Input.getInt();
		}
		for(int n : number) {
			System.out.print(n + " ");
		}
	}
}
