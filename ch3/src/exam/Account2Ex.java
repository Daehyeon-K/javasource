package exam;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Account2Ex {
	
	// 멤버변수, 공유 가능 (static인 메인 안에서 쓰려고)
	private static Account2[] accArr = new Account2[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 >> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				// 계좌생성
				createAccount();
			}
			else if(selectNo==2) {
				accountList();
			}
			else if(selectNo==3) {
				deposit();
			}
			else if(selectNo==4) {
				withdraw();
			}
			else if(selectNo==5) {
				// 종료
				run = false;
			}
			else {
				continue;
			}
		}
	} // main end
	
	
	// 계좌생성
	private static void createAccount() {
		// ano, owner, balance 입력받기
		System.out.print("계좌번호 입력 >> ");
		String ano = sc.nextLine();
		System.out.print("계좌주 입력 >> ");
		String owner = sc.nextLine();
		System.out.print("잔고 입력 >> ");
		int balance = Integer.parseInt(sc.nextLine()); // nextInt 대신 개행 문제 안생기는 이 방식으로!
				
//		// Account2 객체 생성
//		Account2 tArr = new Account2(ano, owner, balance);
//		// 배열에 담아주기
//		accArr[0] = tArr;
		// -> 한줄로는 accArr[0] = new Account2(ano, owner, balance)
		
		for (int i = 0; i<accArr.length;i++) {
			if(accArr[i]==null) {
				accArr[i] = new Account2(ano, owner, balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}
		
		
	}
	
	// 계좌목록
	private static void accountList() {
		for (int i = 0; i<accArr.length;i++) {
			if(accArr[i]!=null) {
				System.out.printf("%d.\t계좌번호: %s\t\t계좌주: %s\t잔고: %s\n",i,accArr[i].getAno(),accArr[i].getOwner(),toNumFormat(accArr[i].getBalance()));
			}
			else {
				break;
			}
		}
	}
	
	// 예금
	private static void deposit() {
		// 계좌번호 입력 받기
		System.out.print("계좌번호 입력\n>> ");
		String ano = sc.nextLine();
		
		// 입금액 입력 받기
		System.out.print("입금액 입력\n>> ");
		int depo = Integer.parseInt(sc.nextLine());
		
		// 입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 acc = findAccount(ano); // 찾아서 새 위치에 주소를 넣기 때문에 같은 자료 참조하는것. 문제 없음
		
		// account가 null 이 아니면 입금
		acc.setBalance(acc.getBalance()+depo);
		
	}
	
	// 출금
	private static void withdraw() {
		// 계좌번호 입력 받기
		System.out.print("계좌번호 입력\n>> ");
		String ano = sc.nextLine();
				
		// 출금액 입력 받기
		System.out.print("출금액 입력\n>> ");
		int with = Integer.parseInt(sc.nextLine());
				
		// 입력받은 계좌번호가 배열에 들어 있는 지 확인
		Account2 acc = findAccount(ano); // 찾아서 새 위치에 주소를 넣기 때문에 같은 자료 참조하는것. 문제 없음
				
		// account가 null 이 아니면 입금
		if ((acc.getBalance()-with)>=0) {
		acc.setBalance(acc.getBalance()-with);}
		else {
			System.out.println("잔고가 부족합니다");
		}
	}
	
	//Account1 배열에서 ano와 동일한 Account 찾기
	private static Account2 findAccount(String ano) {
		// for 돌려서 찾기
		for(int i = 0;i<accArr.length;i++)
		// if !null
		if (accArr[i]!=null) {
			// if 동일
			if (accArr[i].getAno().equals(ano)) {
				// 찾은 거 넘기기
				return accArr[i];
			}
			else {
				continue;
			}
		}
		else {
			break;
		}
		
		return null;
	}
	
	private static String toNumFormat(int num) {
		DecimalFormat formatter = new DecimalFormat("###,###");
		return formatter.format(num);
	}

}
