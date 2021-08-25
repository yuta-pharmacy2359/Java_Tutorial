package pass;
import lib.Input;

public class Pass11_1 {
	public static void main(String[] args) {
		String str;
		while((str = Input.getString()) != null) {
			if(str.equals("dog")) {
				System.out.println("犬");
			} else if(str.equals("cat")) {
				System.out.println("猫");
			} else if(str.equals("mouse")) {
				System.out.println("鼠");
			} else if(str.equals("rabbit")) {
				System.out.println("兎");
			} else {
				System.out.println("?");
			}
		}
	}
}
