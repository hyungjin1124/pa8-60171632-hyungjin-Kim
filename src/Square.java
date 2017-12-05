
public class Square extends Shape {
	public double x, y, width;

	public Square(double x, double y, double width) { // Square 생성자
		this.x = x;
		this.y = y;
		this.width = width;
	}

	public void draw() { // 오버라이딩 
		System.out.println("Rectangle " + "(" + x + "," + y + ")" + "-" + "(" + (x - width) + "," + (y - width) + ")"); // 좌표 출력
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcLength() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}
