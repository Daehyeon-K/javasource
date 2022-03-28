package condition;

import java.util.Scanner;

// 입력 기반 사칙연산

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("첫번째 수 입력 >> ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 수 입력 >> ");
//		int num2 = sc.nextInt();
		
//		이때, 입력 완료 시 엔터를 치는데 숫자\n가 들어가게 되는 거고 int만 나오고 \n만 버퍼에 남아 있는 것
//		이로 인해 이후 nextLine() 등을 사용하면 엔터가 바로 들어가 넘어가버림
//		그렇기에 여기에 sc.nextLine(); 한번 해줘도 되고
//		(int형) = Integer.parseInt(sc.nextLine()) 바로 써줘도 됨 숫자 받을 때
		
		while(true) {
			System.out.print("첫번째 수 입력 >> ");
			int num1 = Integer.parseInt(sc.nextLine()); // 자주 쓸 형태니 외우기
		
			System.out.print("두번째 수 입력 >> ");
			int num2 = Integer.parseInt(sc.nextLine());
		
			System.out.print("-----------------------\n + | - | * | / | % | Q\n-----------------------\n선택>>");
			String menu = sc.nextLine();
		
			if (menu.equals("+")) {
				System.out.printf("%d + %d = %d\n",num1, num2, num1+num2);
			}
			else if (menu.equals("-")) {
				System.out.printf("%d - %d = %d\n",num1, num2, num1-num2);
			}
			else if (menu.equals("*")) {
				System.out.printf("%d * %d = %d\n",num1, num2, num1*num2);
			}
			else if (menu.equals("/")) {
				System.out.printf("%d / %d = %d\n",num1, num2, num1/num2);
			}
			else if (menu.equals("%")) {
				System.out.printf("%d %% %d = %d\n",num1, num2, num1%num2);
			}
			else if (menu.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
