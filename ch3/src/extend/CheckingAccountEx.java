package extend;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount a1 = new CheckingAccount("1-1", "이몽룡", 20000, "5-5");
		CheckingAccount a2 = new CheckingAccount("2-2", "성춘향", 60000, "6-6");
		
		// 예금
		a1.deposit(20000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		// 체크카드 사용
		a1.pay("5-5", 10000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 출금
		a2.withdraw(20000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 체크카드 사용
		a2.pay("7-7", 50000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
	}
}
