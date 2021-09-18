package exercise;

public class A2 {
	protected int doit(String a, int b) {return 0;}
}
class B2 extends A2 {
	@Override
	public int doit(String a, int b) {return 0;}
}
