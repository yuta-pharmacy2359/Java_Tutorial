package pass;

public class Pass13_3_1 {
	public static void main(String[] args) {
		int[][] sales = {
				{120, 130, 100, 110},
				{250, 230, 230, 240},
				{105, 110, 120, 125}
		};
		System.out.println("6月　7月　8月　9月");
		for(int i = 0; i < sales.length; i++) {
			for(int j = 0; j < sales[i].length; j++) {
				System.out.print(sales[i][j] + " ");
			}
			System.out.println();
		}
	}
}
