package sample;

public class Sample4_7 {
	public static void main(String[] args) {
		byte byteValue = 120;
		short shortValue;
		int intValue;
		long longValue;

		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;

		System.out.println(longValue);
	}
}
