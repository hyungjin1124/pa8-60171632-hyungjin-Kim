//60171632 ������
public class Rectangle extends Shape { // Shape�� ����ϴ� ����Ŭ����
	protected double i, j, k, l;

	public Rectangle(double i, double j, double k, double l) { // Rectangle ������ 
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

	public void calcArea() { // �������̵�
		area = k * l; // ���� ���
	}

	public void calcLength() { // �������̵�
		length = (k + l) * 2; // �ѷ� ���

	}

	public void draw() { // �������̵�
		System.out.println("Rectangle " + "(" + i + "," + j + ")" + "-" + "(" + (i + k) + "," + (j + l) + ")"); // ��ǥ ���
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}
