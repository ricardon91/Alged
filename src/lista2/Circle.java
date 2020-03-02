package lista2;

public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return Math.PI * (radius * radius);
	}
}
