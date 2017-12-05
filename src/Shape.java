//60171632 ������
public abstract class Shape implements Drawable, Movable { // Drawable�� �����ϴ� abstract class
	protected double area; // ������ ������ ����
	protected double length; // �ѷ��� ������ ����

	public double getArea() { // ���� ���� �˷��ִ� �޼ҵ�
		return area;
	}

	abstract public void calcArea(); // ������ ������ ���ϱ� ���� �߻�޼ҵ�

	public double getLength() { // �ѷ� ���� �˷��ִ� �޼ҵ�
		return length;
	}

	abstract public void calcLength(); // ������ �ѷ��� ���ϱ� ���� �߻�޼ҵ�
}
