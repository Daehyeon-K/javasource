package array;

import java.util.Arrays;

// 배열: 동일 타입의 데이터, 연속적 저장 = 힙 영역에 저장
// 힙 영역에 저장 위해서 new 키워드 필요
// 기본값으로 초기화를 해줌 (정수: 0, 실수: 0.0, boolean: false)

public class ArrayEx1 {
	public static void main(String[] args) {
		// 5개의 정수를 입력
		int num1 = 3, num2 = 4, num3 = 5, num4 = 6, num5 = 7;
		int num6=0;
		
		// System.out.println("num6 : "+num6); 로컬 변수가 초기화 되지 않음	
		// 로컬 변수는 반드시 초기화가 필요하다는 것!
		
		// 배열로 선언
		int intArray1[] = {3, 4, 5, 6, 7};
		
		// new를 사용한다면, 배열 선언 및 생성 같이 한 것
		int intArray2[] = new int[5]; // 선언 = 생성 구조. 공간 잡아주는 것
		System.out.println("힙 주소 : "+intArray2); // 16진수로 표현된 힙 공간의 주소
		System.out.println("인덱스 0, 1번째 원소 : "+intArray2[0]);
		
		// 새로운 값 저장
		intArray2[0] = 78;
		intArray2[2] = 77;
		intArray2[4] = 80;
		
		for (int i=0;i<5;i++) {
			System.out.println("인덱스 "+i+", "+(i+1)+"번째 원소 : "+intArray2[i]);
		}
		
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+Arrays.toString(intArray1));
		
		
	}
}
