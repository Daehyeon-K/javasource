package condition;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		// 사용자로부터 메시지를 쭉 받아들이기
		// q가 입력되기 전까지 문자를 입력받아보기
		
		String msg;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("메시지를 입력해주세요. (종료를 원하면 q를 입력해주세요.): ");
			msg = sc.nextLine();
		} while(!msg.equals("q"));
		System.out.print("프로그램을 종료합니다.");
		sc.close();
	}
	
}
