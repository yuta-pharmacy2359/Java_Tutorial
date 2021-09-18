package exercise;

class A {}
class B extends A {}
class C extends A {}
class D extends C {}
class E extends D {}

public class Ex20_4_1 {
	public static void main(String[] args) {
		C c = new D();
		System.out.println(c instanceof A); // true
		//System.out.println(c instanceof B); コンパイルエラー
		System.out.println(c instanceof E); // false
	}
}