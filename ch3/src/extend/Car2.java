package extend;

public class Car2 {
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public final void turnOff() { // final method: 오버라이딩 금지를 의미
		System.out.println("시동을 끕니다.");
	}
}
