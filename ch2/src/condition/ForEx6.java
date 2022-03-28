package condition;

public class ForEx6 {
	public static void main(String[] args) {
		// 1 ~ 100 정수 중에서 3의 배수를 더하기 (단, 9의 배수는 더하지 x)
		
		int sum = 0;
		for (int i=1;i<101;i++) {
			if (i%3==0 && i%9!=0) {
				sum +=i; 
			}
		}
		System.out.println("1 ~ 100 정수 중에서 3의 배수를 더하기 (단, 9의 배수는 더하지 x) = "+sum);
		
		// 1 ~ 100 정수 중에서 3의 배수와 5의 배수 총합
		sum = 0;
		for (int i=1;i<101;i++) {
			if (i%3==0 || i%5==0) {
				sum +=i; 
			}
		}
		System.out.println("1 ~ 100 정수 중에서 3의 배수와 5의 배수 총합 = "+sum);

	}
}
