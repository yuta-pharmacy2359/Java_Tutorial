package pass;

import java.util.Arrays;

import lib.Input;

public class Pass13_4 {
	public static void main(String[] args) {
		String[] name = new String[5];
		for(int i = 0; i < name.length; i++) {
			name[i] = Input.getString();
		}
		Arrays.stream(name)
				.sorted()
				.forEach(s -> System.out.println(s));

	}
}
