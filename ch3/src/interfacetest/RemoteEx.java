package interfacetest;

public class RemoteEx {
	public static void main(String[] args) {
		
		// String msg;
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		//RemoteControl rc1 = new RemoteControl(); //Cannot instantiate the type RemoteControl
		// ^^^^ 추상메서드처럼 원래 안되는건데 이거 비슷하게 되게 하는 게 아래의 익명 구현 객체
		
		// 익명 구현 객체
		RemoteControl rc1 = new RemoteControl() { // 구현클래스명이 없어서 익명 구현 객체.
			// 별도 클래스 없이 하는게 편한 특정 경우에 소스파일 안만들고 바로 구현해서 구현에 쓸 수 있는 객체.
			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다.");
			}
			
			@Override
			public void setVoulme(int volume) {
				System.out.println("현재 볼륨 : "+volume);
			}
		};
		
		rc1.turnOn();
		rc1.setVoulme(5);
		rc1.turnOff();
	}
}
