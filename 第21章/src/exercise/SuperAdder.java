package exercise;

public abstract class SuperAdder {
	private int number;
	protected SuperAdder(int number) {
		this.number = number;
	}
	public abstract void add();
	public int getNumber() {
		return number;
	}
}

// SuperAdderクラスの抽象クラス表示abstractがない