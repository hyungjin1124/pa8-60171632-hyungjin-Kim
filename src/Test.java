//60171632 김형진
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40); // 좌표 대입
		shapes[1] = new Rectangle(30, 30, 10, 10); // 좌표 대입
		shapes[2] = new Circle(50, 20, 30); // 좌표 대입

		for (Shape s : shapes) {
			s.calcArea(); // 메소드 호출
			s.calcLength(); // 메소드 호출

			System.out.printf("Area: %.1f", s.getArea()); // 넓이 호출
			System.out.println();
			System.out.printf("Length: %.1f", s.getLength()); // 넓이 호출
			System.out.println();
		}
		Drawable[] drawables = new Drawable[5]; // 새로운 배열 생성
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text"); // Text에 "Sample Text" 전달
		drawables[4] = new Bear(100, 100, 20); // Bear에 좌표 대입
		for (Drawable d : drawables) {
			d.draw(); // 오버라이딩
		}
		System.out.println("----------------------------------");
		Circle circle = new Circle(100, 100, 20); // Circle에 좌표대입
		circle.move(10, 10); // move 메소드에 (10, 10)parameter 전달, Circle을 가로 10, 세로10 만큼 이동
	}
}
