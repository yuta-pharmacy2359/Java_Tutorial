package exercise;

import java.io.IOException;
import java.io.PrintWriter;

import lib.Input;

public class Ex22_2_1 {

	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter("data2.txt")) {
			String text;
			while ((text = Input.getString()) != null) {
				out.println(text);
			}
		} catch (IOException e) {
			System.out.println("エラー発生");
		}
	}

}