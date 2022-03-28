package member.ui;

import java.util.Scanner;

import member.action.Action;
import member.action.MemberAddAction;
import member.action.MemberListAction;
import member.action.MemberModifyAction;
import member.action.MemberRemoveAction;
import member.controller.MemberController;

public class MemberMain {
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		Action action = null; // 블럭 안팎 오가는 변수로
		MemberController controller = new MemberController();
		
		do {
			System.out.println("===== 회원관리 프로그램 =====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.println();
			
			System.out.print("메뉴번호 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;	
			case 3:
				action = new MemberModifyAction();
				break;	
			case 4:
				action = new MemberRemoveAction();
				break;	
			case 5:
				isStop = true;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			if (action!=null) { //NullPointerException 막기 위해
			controller.processRequest(action, sc);
			}
			
		}while(!isStop);
	}
}
