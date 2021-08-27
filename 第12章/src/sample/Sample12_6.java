package sample;
import lib.Input;

public class Sample12_6 {
	public static void main(String[] args) {
		int total = 0, data;
		while((data = Input.getInt("データ")) != 0) {
			if(data < 0) {
				System.out.println("不正なデータ:" + data);
				continue;
			}
			total += data;
		}
		System.out.println("合計=" + total);
	}
}
