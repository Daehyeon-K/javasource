package exception;

public class Account {
	// 속성: 계좌번호, 소유주, 잔액
	String accountNo, owner;
	long balance;
	
	// 생성자
	public Account(String accountNo, String owner, long balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	// this 차이는, 자기 자신의 변수랑 인자 이름 같을 때 명확히 해주기 위해
	
	// 기능: 입출금
	long deposit(long amount) {
		this.balance += amount;
		return balance;
	}
	
	long withdraw(long amount) throws BalanceInsufficientException {
		if (balance < amount) {
			// 예외 강제로 발생시키기
			throw new BalanceInsufficientException("잔고부족 : "+(amount-balance)+"부족");
			// 위에 대신 throw new Exception(메시지)으로 할 수도 있음.
		}
		this.balance -= amount;
		return balance;
	}


}
