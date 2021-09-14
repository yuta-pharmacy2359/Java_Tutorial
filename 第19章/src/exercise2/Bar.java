package exercise2;

import exercise.Foo;

public class Bar {
	public static void main(String[] args) {
		Foo foo = new Foo();
		// System.out.println(foo.str); 	(fooは異なるパッケージのクラスにある変数のためコンパイルエラー)
	}
}
