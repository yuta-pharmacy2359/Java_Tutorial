package exercise;

import java.io.IOException;
import java.io.PrintWriter;

public class Ex22_1_1 {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("data1.txt");
		int n = 2000;
		double x = 1.2345;
		boolean b = true;
		out.println(n);
		out.println(x);
		out.println(b);
		out.close();
	}
}