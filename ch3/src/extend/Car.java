package extend;

//Car는 final class => 상속 금지

public final class Car {
	private String name;
	final String color = "white"; // 변경이 금지된다는 의미의 final로서 초기화 하는 게 기본적.
	
	public Car(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
}
