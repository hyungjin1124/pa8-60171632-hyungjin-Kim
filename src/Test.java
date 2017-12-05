//60171632 ������
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40); // ��ǥ ����
		shapes[1] = new Rectangle(30, 30, 10, 10); // ��ǥ ����
		shapes[2] = new Circle(50, 20, 30); // ��ǥ ����

		for (Shape s : shapes) {
			s.calcArea(); // �޼ҵ� ȣ��
			s.calcLength(); // �޼ҵ� ȣ��

			System.out.printf("Area: %.1f", s.getArea()); // ���� ȣ��
			System.out.println();
			System.out.printf("Length: %.1f", s.getLength()); // ���� ȣ��
			System.out.println();
		}
		Drawable[] drawables = new Drawable[5]; // ���ο� �迭 ����
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text"); // Text�� "Sample Text" ����
		drawables[4] = new Bear(100, 100, 20); // Bear�� ��ǥ ����
		for (Drawable d : drawables) {
			d.draw(); // �������̵�
		}
		System.out.println("----------------------------------");
		Circle circle = new Circle(100, 100, 20); // Circle�� ��ǥ����
		circle.move(10, 10); // move �޼ҵ忡 (10, 10)parameter ����, Circle�� ���� 10, ����10 ��ŭ �̵�
	}
}
