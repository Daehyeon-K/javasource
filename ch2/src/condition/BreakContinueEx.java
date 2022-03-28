package condition;

import java.util.Scanner;

// break, continue 같이 사용

public class BreakContinueEx {
	public static void main(String[] args) {
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1 ~ 3) 선택! (종료: 0) : ");
			
			String num = sc.nextLine();
			menu = Integer.parseInt(num);
			// 기존엔 int num = sc.nextInt();
			
			if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (!(1<=menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택했습니다 (종료: 0)");
				continue;
			}
			System.out.printf("선택하신 메뉴는 %d 입니다.\n", menu);
			
		}
		sc.close();
	}
}
