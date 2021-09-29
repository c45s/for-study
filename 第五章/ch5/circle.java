package ch5;

public class circle {
	private double radius;
	public void Circle(double radius) {this.radius=radius;}
	public double getArea() {
		return Math.PI*radius;
	}
public double getPerimeter() {
	return 2*Math.PI*radius;}
}
