package condition;

public class ForEx4 {

	public static void main(String[] args) {
		// for 인자 각각 꼭 하나일 필요는 없음
		
		// 1 ~ 10 까지 숫자 중에서, 짝수만 출력
		System.out.println("<1 ~ 10 까지 숫자 중에서, 짝수만 출력>");
		for (int i=1; i<11; i++) {
			if (i%2 == 0) {
				System.out.print("i = "+i+"\t");
			}
		}
		
		// 1 ~ 10 까지 숫자 중에서, 홀수만 출력
		System.out.println("\n\n<1 ~ 10 까지 숫자 중에서, 홀수만 출력>");
		for (int j=1; j<11; j++) {
			if (j%2 == 1) {
				System.out.print("j = "+j+"\t");
			}
		}
		
		// 1 ~ 100 까지 숫자 중에서 3의 배수만 출력
		System.out.println("\n\n<1 ~ 100 까지 숫자 중에서, 3의 배수만 출력>");
		for (int k=1; k<101; k++) {
			if (k%3 == 0) {
				System.out.print("i = "+k+"\t");
			}
		}
	}

}
