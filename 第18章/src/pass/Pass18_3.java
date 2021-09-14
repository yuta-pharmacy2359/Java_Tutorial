package pass;

public class Pass18_3 {
	public class Foo {
		private int a = 5;
	}

	public final class Bar extends Foo {
		private int b;
		public Bar() {
			// this.b = a;
		}
	}
}
// aはFooクラスのprivate変数なのでBarクラスではアクセスできない