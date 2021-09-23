package sample;

import java.io.IOException;
import java.io.PrintWriter;

import lib.Input;

public class Sample22_2 {

	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter("data.txt")) {
			String text = Input.getString();
			out.println(text);
		} catch (IOException e) {
			System.out.println("エラー発生");
		}
	}

}
