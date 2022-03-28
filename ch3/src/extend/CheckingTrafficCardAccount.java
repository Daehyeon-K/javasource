package extend;

public class CheckingTrafficCardAccount extends CheckingAccount {
	private boolean hasTrafficCard; // 교통카드 기능 (t/f) : hasTrafficCard
	
	public CheckingTrafficCardAccount(String accountNo, String owner, long balance, String cardNo, boolean hasTrafficCard) {
		super(accountNo, owner, balance, cardNo);
		this.hasTrafficCard=hasTrafficCard;
	}
	
	// 교통비 지불 기능 : payTrafficCard() 
	// cardNo, 교통카드 사용액 매개변수
	public void payTrafficCard(String cardNo, long amount) {
		if (this.hasTrafficCard) { // 교통카드 기능 있는 지 확인
			pay(cardNo, amount); // 부모의 pay 호출
		}
		else {
			System.out.println("교통카드 기능이 없는 카드입니다.");
		}
	}
	
	
	
	
}
