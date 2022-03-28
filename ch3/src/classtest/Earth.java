package classtest;

// static final : 상수
// 상수: 대문자 + 언더바로 표현

//import : 다른 패키지에 있는 클래스 사용 시 필요
//자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능

public class Earth {
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
	static { // 스태틱 변수 초기화를 위한 스태틱 블록
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		// Math.PI 같은 경우도, Math가 클래스명이고 PI도 상수처럼 선언되었을 것이라고 추측 가능
	}
}
