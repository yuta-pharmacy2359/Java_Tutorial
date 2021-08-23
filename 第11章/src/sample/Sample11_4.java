package sample;
import lib.Input;

public class Sample11_4 {
	public static void main(String[] args) {
		int n = Input.getInt("得点");
		String grade;
		if(n >= 80) {
			grade = "A";
		} else if(n >= 70) {
			grade = "B";
		} else if(n >= 60) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("成績は" + grade + "です");
	}
}
