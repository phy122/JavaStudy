package Day07.Ex01_Shape;

public class Circle extends Shape{
	
	double radius;

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this(0);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
