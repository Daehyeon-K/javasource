package interfacetest;

// 인터페이스 : 추상메서드, 다만 추상클래스보다 추상화 정도가 더 높음.
//			 상수와 추상 메서드 만을 가질 수 있음 (변수 못 가짐)
//			 일반 메서드도 사용 불가
//			 다른 클래스 작성에 도움 줄 목적으로 작성
//			 단, JDK 8부터 default, static 키워드 붙은 메소드는 허용

public interface Adder {
	// private int num; => 접근 제한자 public, static, final만 가능함. 변수 선언 불가
	
	public static final int SPADE = 1;
	int DIAMOND = 3; // => public static final 생략 가능
					 // => 어차피 선언한 모든 게 상수로 들어오니까
	final int HEART = 2;
	static int CLOVER = 4;
	
	// public void print() {} => Abstract methods do not specify a body or default나 static 붙여라.
	// body(중괄호) ㄴㄴ 하거나, default or static으로 해결
	
	public void print();
	int add(int x, int y); // public 키워드 생략 가능. 다만 무조건 붙게 된다는 거
	
}
