package classtest;

public class Car {
	// 속성 : 제조사, 모델, 색상, 속도, ...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// 기능: 전진, 후진, ...
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
}
