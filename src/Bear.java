//60171632 ������ 
public class Bear extends Shape { // Shape�� ����ϴ� ���� Ŭ����
	public double x, y, radius;

	public Bear(double x, double y, double radius) {// Bear ������
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() { // �������̵�
		// TODO Auto-generated method stub
		System.out.println("Rectangle " + "(" + (x - radius) + "," + (y - radius) + ")" + "-" + "(" + (x + radius) + ","
				+ (y + radius) + ")");
		System.out.println(
				"Circle center " + "(" + (x - radius) + "," + (y - radius) + ")" + "radius" + "(" + radius / 2 + ")");
		System.out.println(
				"Circle center " + "(" + (x + radius) + "," + (y - radius) + ")" + "radius" + "(" + radius / 2 + ")");
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
