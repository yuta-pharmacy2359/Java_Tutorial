package pass;

import lib.Input;

public class Pass13_5 {
	public static void main(String[] args) {
		String[][] meibo = new String[2][3];
		for(int i = 0; i < meibo.length; i++) {
			for(int j = 0; j < meibo[i].length; j++) {
				meibo[i][j] = Input.getString();
			}
		}
		System.out.print("氏名　　所属　　住所");
		System.out.println();
		for(String[] row : meibo) {
			for(String s : row) {
				System.out.print(s + "　");
			}
			System.out.println();
		}
	}
}