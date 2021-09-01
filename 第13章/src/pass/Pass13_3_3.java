package pass;

public class Pass13_3_3 {
	public static void main(String[] args) {
		String[] name = {"ブドウ", "メロン", "バナナ"};
		int[][] sales = {
				{120, 130, 100, 110},
				{250, 230, 230, 240},
				{105, 110, 120, 125}
		};
		int sum = 0;
		System.out.println("　　　6月　7月　8月　9月　合計");
		for(int i = 0; i < sales.length; i++) {
			System.out.print(name[i] + " ");
			for(int j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + " ");
				sum += sales[i][j];
			}
			System.out.print(sum);
			System.out.println();
			sum = 0;
		}
	}
}
