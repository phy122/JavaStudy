package Day07.Ex01_Shape;

public class Point {
	
	//멤버 변수
	//기본 생성자
	int x;
	int y;
	
	
	public Point() {
		this(0, 0);
	}

	//매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
