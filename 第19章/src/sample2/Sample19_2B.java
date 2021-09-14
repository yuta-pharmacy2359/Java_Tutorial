package sample2;

import sample.Foo;

public class Sample19_2B {
	public static void main(String[] args) {
		Foo foo = new Foo();
		// System.out.println("a=" + foo.a); (aはprivateメソッドのためコンパイルエラー)
		// System.out.println("b=" + foo.b); (bは異なるパッケージのクラスにある変数のためコンパイルエラー)
		System.out.println("c=" + foo.c);
	}
}
