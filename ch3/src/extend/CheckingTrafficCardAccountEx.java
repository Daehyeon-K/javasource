package extend;

public class CheckingTrafficCardAccountEx {
	public static void main(String[] args) {
		CheckingTrafficCardAccount a1 = new CheckingTrafficCardAccount("1-1", "이몽룡", 20000, "5-5", true);
		CheckingTrafficCardAccount a2 = new CheckingTrafficCardAccount("2-2", "성춘향", 60000, "6-6", false);
		
		// 예금
		a1.deposit(20000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		// 교통카드 사용
		a1.payTrafficCard("5-5", 1250);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 출금
		a2.withdraw(20000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 교통카드 사용
		a2.payTrafficCard("7-7", 1250);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
	}
}
