package exercise;

public class Bar extends Foo {
	private String today;
	private String message;
	public Bar(String today, String message) {
		this.today = today;
		this.message = message;
	}
	public String getToday() {
		return today;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public void start() {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void info() {
		// TODO 自動生成されたメソッド・スタブ
		super.info();
	}

}

// コンストラクタの名前が違う(SecondではなくBar)
// 変数todayの型が違う(LocaldateかStringのどちらかに統一)
// (クラス図)Barクラスのstart、stopメソッドは抽象メソッドではないので斜体字にしない