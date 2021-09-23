package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex22_3_1 {

	public static void main(String[] args) {
		Path path = Paths.get("data2.txt");
		try(BufferedReader in = Files.newBufferedReader(path)) {
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
