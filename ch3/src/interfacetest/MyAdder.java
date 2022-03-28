package interfacetest;

// 인터페이스 구현
// 틀 역할인 인터페이스의 상수와 추상메서드 이용

public class MyAdder implements Adder {
	
	@Override
	public void print() {
		System.out.println("출력");
	}
	
	@Override
	public int add(int x, int y) {
		return x+y;
	}
}
