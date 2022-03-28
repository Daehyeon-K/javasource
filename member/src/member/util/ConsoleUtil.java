package member.util;

import java.util.List;
import java.util.Scanner;

import member.dto.MemberDTO;

public class ConsoleUtil {
	// 화면 출력과 받은 데이터 객체로 만드는 등 해서 리턴하는 게 목적
	
	// 추가 (항목 입력받고 객체로 만들어 내보내기)
	public MemberDTO getNewMember(Scanner sc) {
		System.out.println("member 정보 입력");
		System.out.println("===================");
		System.out.print("1. name >> ");
		String name = sc.nextLine();
		System.out.print("2. addr >> ");
		String addr = sc.nextLine();
		System.out.print("3. email >> ");
		String email = sc.nextLine();
		System.out.print("4. age >> ");
		int age = Integer.parseInt(sc.nextLine());
		return new MemberDTO(name, addr, email, age);
	}
	// 추가 관련 메시지
	public void printAddSuccessMessage(){
		System.out.println("회원 정보 추가 성공");
	}
	public void printAddFailMessage(){
		System.out.println("회원 정보 추가 실패");
	}
	
	// list 출력 메소드
	public void printListMessage(List<MemberDTO> list) {
		System.out.println();
		System.out.println("****** member list ******");
		System.out.println("-----------------------------------");
		System.out.println("id\tname\taddr\temail\tage");
		System.out.println("-----------------------------------");
		
		for (MemberDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%d", dto.getId(), dto.getName(), dto.getAddr(), dto.getEmail(), dto.getAge());
			System.out.println();
		}
		System.out.println("\n");
	}
	
	// 수정 (항목 선택)
	public int printModifyMessage(Scanner sc) {
		System.out.println("--- 수정항목 선택 ---");
		System.out.println("1. 주소");
		System.out.println("2. 이메일");
		System.out.print(">> ");
		
		int no = Integer.parseInt(sc.nextLine());
		return no;
	}
	
	// 수정 (id 받기)
		public int printModifyIdMessage(Scanner sc) {
			System.out.println("id 입력");
			System.out.print(">> ");
			int id = Integer.parseInt(sc.nextLine());
			return id;
		}
	
	// 수정 (값 받기)
	public String printModifyValueMessage(Scanner sc) {
		System.out.println("수정 내용 입력");
		System.out.print(">> ");
		String input = sc.nextLine();
		return input;
	}
	// 수정 관련 메시지
		public void printModifySuccessMessage(){
			System.out.println("회원 정보 수정 성공");
		}
		public void printModifyFailMessage(){
			System.out.println("회원 정보 수정 실패");
		}
		
		
	// 삭제 (id 입력 받기)
		public int printRemoveMessage(Scanner sc) {
			System.out.println("삭제할 id 입력");
			System.out.print(">> ");
			return Integer.parseInt(sc.nextLine()); // sc.nextInt(); // ==> 이거 때문에 데이터 없앨때 NumberFormatException 뜸. Integer.parseInt 해야 함.
		}
	// 삭제 관련 메시지
		public void printRemoveSuccessMessage(){
			System.out.println("회원 정보 삭제 성공");
		}
		public void printRemoveFailMessage(){
			System.out.println("회원 정보 삭제 실패");
		}
	
}
