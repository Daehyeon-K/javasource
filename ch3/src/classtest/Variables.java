package classtest;

//<<자바 변수 종류>>
//	클래스 변수
//		선언 위치: 클래스 영역
//		생성 시기: 객체 생성 시
//	인스턴스 변수 (멤버 변수)
//		선언 위치: 클래스 영역
//		생성 시기: 객체 생성 시
//	지역 변수 (로컬 변수)
//		선언 위치: 메소드 내부, 생성자 내부, 초기화 블럭 내부
//		생성 시기: 변수 선언문이 수행될 때

public class Variables {
	int num; // 인스턴스 변수
	static int cv; // 클래스 변수
	
	void method() {
		int lv = 0; // 로컬 변수
		System.out.println(lv);
	}
}
