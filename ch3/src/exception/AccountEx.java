package exception;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("111", "홍길동", 200000);
		try {
			account.withdraw(300000);
		} catch (BalanceInsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
