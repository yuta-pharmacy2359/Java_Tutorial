package sample;

public abstract class Shape {
	private String color;
	protected Shape(String color) {
		this.color = color;
	}
	public abstract String getName();
	public abstract double area();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
