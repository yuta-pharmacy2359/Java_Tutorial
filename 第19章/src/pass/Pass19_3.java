package pass;

class One {
	protected int n = 0;
	public One() {
		System.out.print(n);
	}
}

class Two extends One {
	public Two() {
		++n;
		System.out.print(n);
	}
}

public class Pass19_3 {
	public static void main(String[] args) {
		Two two = new Two();
		System.out.print(two.n);
	}
}
// 011と表示