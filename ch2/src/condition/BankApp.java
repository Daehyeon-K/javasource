package condition;

import java.util.Scanner;
import java.text.DecimalFormat; // 십진수 포매팅 for 천 단위 쉼표

public class BankApp {
	public static void main(String[] args) {
		// 예금, 출금, 잔고, 종료 기능의 은행 프로그램 제작
		DecimalFormat formatter = new DecimalFormat("###,###"); // 천 단위 쉼표!
		
		int balance = 0, temp, menu;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("---------------------------------\n1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\n---------------------------------\n선택>>");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("예금할 금액을 입력하시오. : ");
				balance += sc.nextInt();
				continue;
			}
			if (menu == 2) {
				System.out.print("출금할 금액을 입력하시오. : ");
				temp = sc.nextInt();
				if (balance<temp) {
					System.out.println("잔고가 부족합니다.");
				}
				else {
					balance -= temp;
				}
				continue;
			}
			if (menu == 3) {
				System.out.println("잔고 : "+formatter.format(balance)+"원");
				continue;
			}
			if (menu == 4) {
				System.out.print("은행 프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("메뉴 선택이 잘못 되었습니다.");
				continue;
			}
		}
		
		sc.close();
	}
}
