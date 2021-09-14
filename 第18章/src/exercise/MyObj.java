package exercise;

public class MyObj {
	public static int a = 10;		//①
	private double b;				//②
	public MyObj(double b) {		//③
		this.b = b;
	}
	public void printA() {			//④
		System.out.println(a);
	}
	public void printB() {			//⑤
		System.out.println(b);
	}
	public static void printC() {	//⑥
		System.out.println(a);
	}
}
// サブクラスに継承されないもの→①、②、③、⑥