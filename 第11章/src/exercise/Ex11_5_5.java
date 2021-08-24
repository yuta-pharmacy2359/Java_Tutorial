package exercise;
import lib.Input;

public class Ex11_5_5 {
	public static void main(String[] args) {
		double weight;
		int souryo;
		while((weight = Input.getDouble("重さ")) != 0) {
			if(weight >= 10) {
				souryo = 1500;
			} else if(weight >= 5) {
				souryo = 800;
			} else if(weight >= 1) {
				souryo = 500;
			} else {
				souryo = 300;
			}
			System.out.println("送料=" + souryo);
		}
	}
}