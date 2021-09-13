package sample;

public class StaticAdder {
	private static int number;
	public static void add() {
		number++;
	}
	public static void main(String[] args) {
		number = 10;
		add();
		add();
		System.out.println("number = " + number);
	}
}
