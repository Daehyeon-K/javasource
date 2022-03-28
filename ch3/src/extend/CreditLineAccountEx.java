package extend;

public class CreditLineAccountEx {
	public static void main(String[] args) {
		
		CreditLineAccount a1 = new CreditLineAccount("1-1", "이몽룡", 20000, 3000000);
		CreditLineAccount a2 = new CreditLineAccount("2-2", "성춘향", 60000, 5000000);
		
		// 예금
		a1.deposit(20000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		// 교통카드 사용
		a1.withdraw(125000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 출금
		a2.withdraw(20000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 교통카드 사용
		a2.withdraw(2000000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
	}
}
