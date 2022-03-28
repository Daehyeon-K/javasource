package op;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		//사용자로부터 한달 월급을 입력받은 후
		//한달 월급을 10년동안 저축했을 때 금액 확인하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한 달 월급을 입력하시오. : ");
		int salary = sc.nextInt();
		
		System.out.println("월급을 10년 동안 저축했을 때 금액 : "+salary*120+"원");
		
		sc.close();
	}
}
