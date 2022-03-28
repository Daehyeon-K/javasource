package classtest;

import java.util.Scanner; // 외부 클래스 선언 및 생성 위해서 import 필요
// java.util은 패키지명

// import : 다른 패키지에 있는 클래스 사용 시 필요
//			자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능

public class EarthEx { // 요건 classtest.EarthEx가 될 거임

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지구 반지름 : "+Earth.EARTH_RADIUS+"km");
		System.out.println("지구 표면적 : "+Earth.EARTH_SURFACE_AREA+"km^2");
		
		sc.close();
		
	}

}
