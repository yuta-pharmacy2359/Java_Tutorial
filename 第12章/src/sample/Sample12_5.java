package sample;
import lib.Input;

public class Sample12_5 {
	public static void main(String[] args) {
		int total = 0, data;
		while((data = Input.getInt()) != 0) {
			if(data < 0) {
				System.out.println("不正なデータ:" + data);
				break;
			}
			total += data;
		}
		System.out.println("合計=" + total);
	}
}
