package condition;

public class WhileEx2 {
	public static void main(String[] args) {
		// 1 ~ 10까지 합 구하기
		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum += i++;	
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.", sum);
		
		// 1 ~ 100까지 합 구하기
		int j = 1;
		int sumj = 0;
		while (j<=100) {
			sumj += j++;	
		}
		System.out.printf("\n\n1부터 100까지의 합은 %d입니다.", sumj);
	}
}
