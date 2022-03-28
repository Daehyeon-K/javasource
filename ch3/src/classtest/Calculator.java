package classtest;

public class Calculator {
	
	// 오버라이딩 - 생성자 오버라이딩, 메소드 오버라이딩
	
	// 정사각형 넓이
	double areaRectangle (double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle (double width, double height) { // 메소드 오버라이딩 - 매개변수 타입, 개수, 순서 달라야
		return width * height;

	}
}

