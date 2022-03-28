package api;

import java.util.Arrays;

public class MathEx3 {
	public static void main(String[] args) {
		// 반복문
		// 1~3 까지 난수 3개 생성한 뒤 한 줄에 출력
		// 모두 같은 수가 나올 때 까지 반복
		
		int n[] = new int[3];
		int smallC = 0;
		
		for (int k=0;k<1000;k++) { // 효율 측정해보기
		while(true) {
			for (int i=0;i<n.length;i++) {
				n[i] = ((int)(Math.random()*3)+1);
				smallC++;
			}
			System.out.println(Arrays.toString(n));
			if (intArrayMatch(n)) {
				System.out.println("세 값이 서로 같습니다.");
				break;
			}
		}
		}
	}
	
	public static boolean intArrayMatch(int intArr[]) {
		for (int i = 0 ; i<intArr.length-1 ; i++) {
			if (intArr[i] != intArr[i+1]) { return false; }
		}
		return true;
	}
}
