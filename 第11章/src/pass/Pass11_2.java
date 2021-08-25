package pass;

public class Pass11_2 {
	public static void main(String[] args) {
		double[] height = { 175.2, 160.0, 153.6, 177.5, 185.7, 172.3, 191.3 };
		int a = 0, b = 0, c = 0, d = 0;
		for(double hgt : height) {
			if(hgt < 160) {
				a++;
			} else if(hgt < 170) {
				b++;
			} else if(hgt < 180) {
				c++;
			} else {
				d++;
			}
		}
		System.out.printf("a:\t%d%nb:\t%d%nc:\t%d%nd:\t%d", a, b, c, d);
	}
}
