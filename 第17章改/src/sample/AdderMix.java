package sample;

public class AdderMix {
	private int number;
	public AdderMix(int number) {
		this.number = number;
	}
	public void add() {
		number++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static void main(String[] args) {
		AdderMix num = new AdderMix(10);
		num.add();
		num.add();
		System.out.println("number = " + num.getNumber());
	}
}
