package exercise;

public class Ex12_5_1 {
	public static void main(String[] args) {
		String[] msg = { "Good", "Better", "Best", "Bad", "Worse", "Worst", "OK" };
		for(String message : msg) {
			if(message.length() > 4) {
				continue;
			}
			System.out.println(message);
		}
	}
}
