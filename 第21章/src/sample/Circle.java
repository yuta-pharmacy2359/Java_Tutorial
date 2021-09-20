package sample;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "円形";
	}

	@Override
	public double area() {
		// TODO 自動生成されたメソッド・スタブ
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}
