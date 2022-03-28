package condition;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// 숫자 입력받은 후 짝수, 홀수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. : ");
		int num = sc.nextInt();
		
		if (num%2!=0) {
			System.out.println("홀수입니다.");
		}
		else if (num==0){
			System.out.println("0입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
		sc.close();

	}

}
