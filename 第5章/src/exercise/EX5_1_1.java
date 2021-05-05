package exercise;

public class EX5_1_1 {
	public static void main(String[] args) {
		int n = 1, ans;
		System.out.print(++n);
		System.out.print(n++);
		System.out.print(n);
		ans = 1 + n++;
		System.out.print(ans);
		System.out.println(n);
	}
}
