package sample;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class Sample20_4 {
	public static void main(String[] args) {
		A a = new C();
		System.out.println(a instanceof A); // true
		System.out.println(a instanceof B); // true
		System.out.println(a instanceof C); // true
		System.out.println(a instanceof D); // false
	}
}
