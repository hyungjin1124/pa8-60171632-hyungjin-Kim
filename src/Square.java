
public class Square extends Shape {
	public double x, y, width;

	public Square(double x, double y, double width) { // Square ������
		this.x = x;
		this.y = y;
		this.width = width;
	}

	public void draw() { // �������̵� 
		System.out.println("Rectangle " + "(" + x + "," + y + ")" + "-" + "(" + (x - width) + "," + (y - width) + ")"); // ��ǥ ���
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
