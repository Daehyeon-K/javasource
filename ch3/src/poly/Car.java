package poly;

public abstract class Car {
	// 추상메소드 : 템플릿 메소드 가지고 있음
	public abstract void drive(); // 선언만 하는 템플릿 메소드
		
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("장비를 정지합니다.");
	}
	
	
}
