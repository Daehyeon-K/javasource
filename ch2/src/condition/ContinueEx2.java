package condition;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 0 ~ 10 까지의 숫자 중에서 짝수만 출력 (continue 사용)
		for (int i = 0; i <=10 ;i++) {
			if (i%2==1) {continue;}
			System.out.println("i = "+i);
		}
		
		// 1 ~ 100 까지의 숫자 중에서 홀수의 합 출력 (continue 사용)
		int sum = 0;
		for (int j = 1; j <=100; j++) {
			if (j%2==0) {continue;}
			sum += j;
		}
		System.out.println("\n1 ~ 100 까지의 숫자 중에서 홀수의 합 = "+sum);
		
		
	}

}
