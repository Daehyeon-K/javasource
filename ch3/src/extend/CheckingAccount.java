package extend;

// Account + 체크카드

public class CheckingAccount extends Account{

	private String cardNo; // 체크카드 번호
	
	public CheckingAccount(String accountNo, String owner, long balance, String cardNo) {
		super(accountNo, owner, balance);
		this.cardNo=cardNo;
	}
	
	// 직불카드 사용액을 지불한다.
	// 매개인자로 직불카드번호와 사용액을 받아서
	// 카드번호 일치 여부 및 은행 잔고 비교한 후 지불 
	public void pay(String cardNo, long amount) {
		if (this.cardNo.equals(cardNo)) {
			if (this.getBalance()>=amount) {
				this.withdraw(amount); // 부모 메소드 그대로 사용하면 됨
				System.out.println(amount+"원이 결제되었습니다.");
			}
			else {
				System.out.println("잔고가 부족합니다.");
			}
		}
		else {
			System.out.println("유효하지 않은 카드 번호입니다.");
		}
	}
	
}
