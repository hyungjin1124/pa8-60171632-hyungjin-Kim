//60171632 김형진
public class Triangle extends Shape { // Shape를 상속하는 서브 클래스
	public double x, y, bottom, width;

	public Triangle(double x, double y, double bottom, double width) { // Triangle 생성자
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width = width;
	}

	@Override
	public void draw() { // 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("Triangle " + "(" + x + "," + y + ")" + "-" + "(" + (x - bottom / 2) + "," + (y - width)
				+ ")" + "(" + (x + bottom / 2) + "," + (y - width) + ")"); // 좌표 출력 
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
