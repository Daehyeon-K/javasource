package condition;

public class PrimeNumber {
	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 소수를 구하기
		
		System.out.println("< 1 ~ 100 중의 소수는? >");
		int flag; // flag 보단 count
		for (int i = 1; i <=100; i++) {
			flag=0;
			if (i==1) {
				continue;
			}
			for (int j = 1; j<=i; j++) {
				if (i%j==0) {
					++flag;	
				}
			}
			if (flag <= 2) {
				System.out.printf("Number %d is a prime number.\n", i); 
			} //if의 조건을 flag == 로 하면 i == 1 조건문 없어도 됨.
		}
	}
}
