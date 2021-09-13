package sample;

public class Sample17_7 {
	public static void main(String[] args) {
		Adder num = new Adder(10);
		num.add();
		num.add();
		System.out.println("number = " + num.getNumber());
	}
}
