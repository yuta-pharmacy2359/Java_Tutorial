package sample;

class Adder {
	private int number = 0;
	public void add() {
		number++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

class SubAdder extends Adder {
	public void add(int n) {
		setNumber(getNumber() + n);
	}
}
