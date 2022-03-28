package extend;

// Car는 final class => 상속 금지

public class AiCar /*extends Car*/ { // final 클래스엔 서브 클래스 못 갖는다는 에러 나옴
	Car car = new Car("현대");
	String msg;
	// 기존 클래스를 받아서 확장해 쓰고 싶을 때 상속할 지 포함할 지 알아야 하고
	// 그러려면 final인지 아닌지도 알아야 함
	// final class는 is-a 안되니까 포함관계로만 쓰는. 대표적으로 String
}
