package exercise;

public class Ex13_6_1 {
	public static void main(String[] args) {
		int[][] drink = {
				{100, 150, 280, 220},
				{120, 200, 250, 210}
		};
		System.out.println(drink[0][0]);
		System.out.println(drink[0][2]);
		System.out.println(drink[1][2]);

		int total1 = 0;
		for(int i = 0; i < 2; i++) {
			total1 += drink[i][0];
		}
		System.out.println(total1);

		int total2 = 0;
		for(int j = 0; j < 4; j++) {
			total2 += drink[0][j];
		}
		System.out.println(total2);
	}
}
