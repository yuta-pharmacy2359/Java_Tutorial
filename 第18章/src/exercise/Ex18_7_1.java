package exercise;

public class Ex18_7_1 {
	public class Foo {
		private int value;
	}
	public class Bar extends Foo {
		private int number;
		public Bar(int number) {
			this.number = number;
		}
	}
 }
// 正常に動作する