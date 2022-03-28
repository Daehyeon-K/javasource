package classtest;

public class Triangle {
	// 속성: 밑변, 높이
	int baseLine, height;

	// 생성자
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}
		
	// 기능: 면적 구하기
	double getArea() {
		return baseLine*height/2;
	}
}
