package sample;

public class Parent {
	public void print() {
		System.out.println("Parentクラス");
	}
}

class Child extends Parent {
	@Override
	public void print() {
		System.out.println("Childクラス");
	}
}
