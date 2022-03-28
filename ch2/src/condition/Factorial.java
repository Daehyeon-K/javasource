package condition;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// 숫자 입력 받고, 그 숫자의 팩토리얼 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num;i>0;i--) {
			fact *= i;
		}
		System.out.println(num+" 팩토리얼 = "+fact);
		sc.close();
	}
}
