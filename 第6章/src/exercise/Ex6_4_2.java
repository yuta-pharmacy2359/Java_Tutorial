package exercise;

import lib.Input;

public class Ex6_4_2 {
	public static void main(String[] args) {
		String name = Input.getString();
		int price = Input.getInt();
		System.out.println("商品名:" + name);
		System.out.println("単価:" + price);
	}
}
