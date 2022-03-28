package extend;

// Account + 체크카드 : CheckingAccount
// Account + 체크카드 + 교통카드 기능 : CheckingTrafficCardAccount
// Account + 마이너스 기능 : CreditLineAccount
// Account + 보너스 포인트 : BonusPointAccount

public class Account {
	private String accountNo, owner;
	private long balance;
	
	public Account(String accountNo, String owner, long balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	long deposit(long amount) {
		this.balance += amount;
		return balance;
	}
	
	long withdraw(long amount) {
		this.balance -= amount;
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	

}
