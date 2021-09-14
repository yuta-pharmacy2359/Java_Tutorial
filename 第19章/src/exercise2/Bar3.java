package exercise2;

import exercise.Foo3;

public class Bar3 extends Foo3 {
	public void print(Foo3 foo) {
		// System.out.println(foo.str);
	}
}
// コンパイルエラー(異なるパッケージの場合、他のクラスのメンバからのアクセスは不可)