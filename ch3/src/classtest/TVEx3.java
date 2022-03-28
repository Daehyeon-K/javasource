package classtest;

import java.util.Arrays;

public class TVEx3 {
	public static void main(String[] args) {
		// TV 객체를 배열로 생성
		
		// 타입 배열명 [] = new 타입[길이];
		// int arr [] = new int[5];
		
		TV tvArr[] = new TV[5];
		
		System.out.println(Arrays.toString(tvArr));
		// >> [null, null, null, null, null]
		
		// System.out.println(tvArr[0].channel);
		// 앞으로 자주 만날, NullPointerException 발생!
		// 참조변수에서 생기는 문제
		// 객체.을 해서 해당 위치로 가라는 명령을 수행했는데 null이 있을 때
		// 그냥 객체가 제대로 생성되지 않았거나 값이 제대로 들어가지 않았다고 생각하면 됨.
		
		// 클래스(객체) 배열을 이렇게 하면 초기값은 null
		// 얘들을 TV 클래스에 있는 애들 들어갈 공간 만드려면 TV 객체 생성 후 배열에 담는 작업 필요
		for (int i = 0 ; i < tvArr.length;i++) {
			tvArr[i] = new TV();
		} // 이렇게 해줘야 함
		
		System.out.println(Arrays.toString(tvArr));
		for (int i = 0 ; i < tvArr.length;i++) { // => 이러면 루프마다 length 확인하니, 변수 만들어서 반복 줄이고 속도 높이기
			tvArr[i].channel = 10+i;
			System.out.println(tvArr[i].channel);
		}
		
		int length = tvArr.length; // => 요거 이용하기
		
		for (int i = 0 ; i < length;i++) { // => 이러면 루프마다 length 확인하니, 변수 만들어서 반복 줄이고 속도 높이기
			tvArr[i].channel = 10+i;
			System.out.println(tvArr[i].channel);
		}
		
	}
}
