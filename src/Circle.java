//60171632 김형진
public class Circle extends Shape { // Shape를 상속하는 서브 클래스
	protected double i, j, k;

	public Circle(double i, double j, double k) { // Circle 생성자
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public void calcArea() { // 오버라이딩

		area = k * k * Math.PI; // 넓이 계산

	}

	public void calcLength() { // 오버라이딩

		length = 2 * k * Math.PI; // 넓이 계산

	}

	public void draw() { // 오버라이딩
		System.out.println("Circle center " + "(" + i + "," + j + ")" + "-" + "radius" + "(" + k + ")"); // 원의 중심 좌표와
																											// 반지름 출력
	}

	protected double dx, dy;

	public void move(double dx, double dy) {
		for (int x = 0; x < 11; x++) {
			System.out.println(
					"Circle center " + "(" + (i + dx * x) + "," + (j + dy * x) + ")" + "-" + "radius" + "(" + k + ")");
		}
	}
}