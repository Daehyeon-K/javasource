package exam;

import java.util.Scanner;

public class MemberServiceEx2 {
	public static void main(String[] args) {
		// MemberService 객체 생성
		MSSingleton ms = MSSingleton.getInstance();
		String id, password;
		Scanner sc = new Scanner(System.in);
		
		// login 메소드 호출
		System.out.print("아이디를 입력하십시오.\n>> ");
		id = sc.nextLine();
		System.out.print("비밀번호를 입력하십시오.\n>> ");
		password = sc.nextLine();
		
		// 메소드 호출 결과를 받아 true인 경우 "로그인 되었습니다." 출력. 이후 로그아웃 메소드 호출
		if (ms.login(id, password)) {
			System.out.println("로그인 되었습니다.");
			ms.logout();
		}
		
		// false인 경우 "id 또는 password가 올바르지 않습니다" 메세지 출력
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		sc.close();
		
		
		
		
	}
}
