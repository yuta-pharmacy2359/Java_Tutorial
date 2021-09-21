package pass;

public class Exec {

	public static void main(String[] args) {
		// Writable w = new Work(); → x
		Readable2 w = new Work();
		// Work w = new Work();
		w.read();
	}

}