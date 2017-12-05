//60171632 ������
public class Circle extends Shape { // Shape�� ����ϴ� ���� Ŭ����
	protected double i, j, k;

	public Circle(double i, double j, double k) { // Circle ������
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public void calcArea() { // �������̵�

		area = k * k * Math.PI; // ���� ���

	}

	public void calcLength() { // �������̵�

		length = 2 * k * Math.PI; // ���� ���

	}

	public void draw() { // �������̵�
		System.out.println("Circle center " + "(" + i + "," + j + ")" + "-" + "radius" + "(" + k + ")"); // ���� �߽� ��ǥ��
																											// ������ ���
	}

	protected double dx, dy;

	public void move(double dx, double dy) {
		for (int x = 0; x < 11; x++) {
			System.out.println(
					"Circle center " + "(" + (i + dx * x) + "," + (j + dy * x) + ")" + "-" + "radius" + "(" + k + ")");
		}
	}
}