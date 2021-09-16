package exercise;

public final class Player2 {
	private final int life = 10;
	public int getLife() {
		return life;
	}
	public void magic() {
		// life *= 10;
	}
}

// 変数finalにはfinal修飾子がついているので、変数の値を変更する処理はコンパイルエラーとなる。