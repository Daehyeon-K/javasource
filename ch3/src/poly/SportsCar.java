package poly;

public class SportsCar extends Car {
	@Override
	public void drive() {
		System.out.println("스포츠카를 운전합니다");
		
	}
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춥니다");
	} 
	
//	private void stop() {
//	} // 아무것도 안해도 들어와야 됨. 상속받는 자식 클래스에 필요 (?)
	
}
