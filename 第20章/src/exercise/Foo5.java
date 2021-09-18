package exercise;

class Foo5 {
	protected int n = 10;
	public void print() {
		System.out.println(n);
	}
}

class Bar5 extends Foo5 {
	@Override
	public void print() {
		System.out.println(2 * n);
	}
	public static void main(String[] args) {
		Foo5 f = new Bar5();
		f.print();
	}
}