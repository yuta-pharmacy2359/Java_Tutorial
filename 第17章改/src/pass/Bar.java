package pass;

public class Bar {
	int n;
	double x;
	public Bar(int n, double x) {
		this.n = n;
		this.x = x;
	}
	public Bar(double x) {
		//this(x, 5);
	}
}
// thisの中の引数の順番が逆(int, doubleの順)
