package pass;

public class MyMessage extends Message {
	public void eval(int n) {
		switch(n) {
			case 100, 200 -> System.out.println("正常");
			default -> System.out.println("エラー");
		};
	}
}
