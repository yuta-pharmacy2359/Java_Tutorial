package pass;

public class Car implements FastRunnable {
	String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public double maxSpeed() {
		return 300.0;
	}


}
