package array;

import java.util.Arrays; // 클래스 임포트 까먹지 말기

public class ArrayEx7 {
	public static void main(String[] args) {
		// 1 ~ 45 번을 가지고 있는 카드 생성
		// 서로 섞은 후 출력
		
		int cards[] = new int[45], temp;
		
		for (int i = 0; i<cards.length; i++) {
			cards[i]=i+1;
		}
		System.out.println(Arrays.toString(cards));
		
		// temp를 이용한 간단한 swap 
		for (int i = 0 ; i < cards.length ; i++) {
			int random1 = (int)(Math.random()*45), random2 = (int)(Math.random()*45);
			temp = cards[random1];
			cards[random1] = cards[random2];
			cards[random2] = temp;
		}
		int random1 = (int)(Math.random()*45)+1;
		System.out.println(Arrays.toString(cards));
		System.out.println(random1);
		
		// Fisher-Yates Shuffle 알고리즘 이용?
	}
}
