package sample;

public class Sample5_2 {
	public static void main(String[] args) {
		int ans, n;

		n = 10;
		ans = n++;
		System.out.println(n);
		System.out.println(ans);

		n = 10;
		ans = ++n;
		System.out.println(n);
		System.out.println(ans);
	}
}
