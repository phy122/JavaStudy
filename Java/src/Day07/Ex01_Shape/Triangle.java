package Day07.Ex01_Shape;

public class Triangle extends Shape{
	
	double width, height;
	
	//생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Triangle() {
		this(0.0,0.0);
	}

	@Override
	double area() {
		//삼각형의 넓이 = (가로) X (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		//*정삼각형
		//삼각형의 둘레 = 3*width 
		return 3 * width;
	}

	public double getWidth() {
		return width;
	}

	//getter, setter
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}
