package sample;
import lib.Input;

public class Sample13_1 {
	public static void main(String[] args) {
		int size = Input.getInt("要素数");
		int[] number = new int[size];
		for(int n : number) {
			System.out.print(n + " ");
		}
	}
}
