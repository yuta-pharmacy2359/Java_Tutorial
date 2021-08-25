package pass;
import lib.Input;

public class Pass10_1 {
	public static void main(String[] args) {
		String str;
		while((str = Input.getString("[String]")) != null) {
			System.out.println("<" + str.length() + ">" + str);
		}
	}
}
