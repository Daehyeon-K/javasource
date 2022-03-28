package extend;

public class CreditLineAccount extends Account {
	
	// 마이너스 한도 필드 : creditLine
	private long creditLine;

	public CreditLineAccount(String accountNo, String owner, long balance, long creditLine) {
		super(accountNo, owner, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	long withdraw(long amount) {
		// 잔액 = 잔액 + 마이너스 한도(500백만)
		// 사용액 amount 보다 잔액이 작은지 확인
		// 차감이 가능하다면 잔액 - 사용액
		// return값은 잔액으로
		if (getBalance()+creditLine>=amount) {
			this.setBalance(getBalance()-amount);
			return getBalance();
		}
		System.out.println("잔액 부족");
		return -1;
		
	}

}
