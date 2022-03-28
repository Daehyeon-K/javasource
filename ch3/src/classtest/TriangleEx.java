package classtest;

public class TriangleEx {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 5);
		System.out.printf("밑변 %d, 높이 %d인 삼각형의 높이는 %.2f 입니다.",triangle.baseLine,triangle.height,
				triangle.getArea());

	}
}
