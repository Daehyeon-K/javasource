package poly;

public class CarEx {
	public static void main(String[] args) {
		// Car car = new Car(); // Cannot instantiate the type Car=> 추상클래스는 직접적으로 객체 생성, 선언 안됨.
		Car car = new SportsCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		car = new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
	}
}
