//60171632 ������
public class Triangle extends Shape { // Shape�� ����ϴ� ���� Ŭ����
	public double x, y, bottom, width;

	public Triangle(double x, double y, double bottom, double width) { // Triangle ������
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width = width;
	}

	@Override
	public void draw() { // �������̵�
		// TODO Auto-generated method stub
		System.out.println("Triangle " + "(" + x + "," + y + ")" + "-" + "(" + (x - bottom / 2) + "," + (y - width)
				+ ")" + "(" + (x + bottom / 2) + "," + (y - width) + ")"); // ��ǥ ��� 
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
