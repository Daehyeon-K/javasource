package extend;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		BonusPointAccount a1 = new BonusPointAccount("1-1", "이몽룡", 20000);
		BonusPointAccount a2 = new BonusPointAccount("2-2", "성춘향", 60000);
		
		// 예금
		a1.deposit(20000);
		// 현재 잔액
		System.out.println(a1.getOwner()+"님 잔액 : "+a1.getBalance());
		// 현재 보너스
		System.out.println(a1.getOwner()+"님 포인트 : "+a1.getBonusPoint());
		
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 출금
		a2.withdraw(20000);
		// 현재 잔액
		System.out.println(a2.getOwner()+"님 잔액 : "+a2.getBalance());
		// 현재 보너스
		System.out.println(a2.getOwner()+"님 포인트 : "+a2.getBonusPoint());
	}
}
