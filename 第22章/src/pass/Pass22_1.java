package pass;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pass22_1 {

	public static void main(String[] args) {
		Path path = Paths.get("temp");
		try {
			Files.createDirectory(path);
		} catch(IOException e) {
			System.out.println("フォルダを作成できません");
		}
		try(PrintWriter out = new PrintWriter("temp/sales.txt")) {
			out.print("SY-200" + "\t");
			out.print("冷蔵庫" + "\t");
			out.print(50000 + "\t");
			out.print(20 + "\t");
			out.println(true);
			out.print("TB-100" + "\t");
			out.print("洗濯機" + "\t");
			out.print(30000 + "\t");
			out.print(15 + "\t");
			out.println(true);
		} catch(IOException e) {
			System.out.println("書き込み時にエラーが発生しました");
		}
	}
}
