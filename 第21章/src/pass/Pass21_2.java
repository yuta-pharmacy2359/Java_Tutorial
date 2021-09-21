package pass;

import exercise.Calculation;
import exercise.Sum;

public class Pass21_2 {

	public static void main(String[] args) {
		double[] dbl = {1.5, 1.4, 3.2, 2.4};
		Calculation ca = new Sum(dbl) ;
		System.out.println(ca.total());
	}

}
