package sample;

public class Sample20_9 {
	public static void main(String[] args) {
		SubAdder sa = new SubAdder();
		System.out.println("number = " + sa.getNumber());
		sa.add();
		System.out.println("number = " + sa.getNumber());
		sa.add(10);
		System.out.println("number = " + sa.getNumber());
	}
}
