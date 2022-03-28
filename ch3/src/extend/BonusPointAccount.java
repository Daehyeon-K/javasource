package extend;

public class BonusPointAccount extends Account {
	// 보너스 포인트 저장. 정수 형태. 예금액의 0.1% 정도 포인트로 적립
	private int bonusPoint=0;
	
	public BonusPointAccount(String accountNo, String owner, long balance) {
		super(accountNo, owner, balance);
	}
	
	// 예금 & 보너스 포인트 = 예금액 * 0.1%
	@Override
	long deposit(long amount) {
		super.deposit(amount);
		bonusPoint += amount*(0.001); 
		return super.deposit(amount);
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	
}