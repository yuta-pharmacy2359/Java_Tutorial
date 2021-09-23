package sample;

import java.io.IOException;
import java.io.PrintWriter;

import lib.Input;

public class Sample22_1 {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("data.txt");
		String text = Input.getString();
		out.println(text);
		out.close();
	}
}
