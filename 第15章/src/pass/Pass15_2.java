package pass;

import lib.Input;
import sample.MyTools;

public class Pass15_2 {
	public static void main(String[] args) {
		double km = Input.getDouble("km");
		double mile = MyTools.kmToMile(km);
		System.out.println(km + "km" + " = " + mile + "mile");
		mile = Input.getDouble("mile");
		km = MyTools.mileToKm(mile);
		System.out.println(mile + "mile" + " = " + km + "km");
	}
}
