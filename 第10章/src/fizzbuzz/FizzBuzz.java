package fizzbuzz;

import lib.Input;

public class FizzBuzz {
	public static void main(String[] args) {
		int n = Input.getInt();
		if (n % 15 == 0) {
			System.out.println("Fizz Buzz");
		} else if (n % 3 == 0) {
			System.out.println("Fizz");
		} else if (n % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(n);
		}
	}
}
