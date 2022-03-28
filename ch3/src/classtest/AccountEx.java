package classtest;

public class AccountEx {

	public static void main(String[] args) {
		Account a1 = new Account("1002-***-******", "권대현", 15000L);
		
		System.out.println("현재 잔액 : "+a1.balance);
		a1.deposit(50000);
		System.out.println("현재 잔액 : "+a1.balance);
		a1.withdraw(55000);
		System.out.println("현재 잔액 : "+a1.balance);
		
	}

}
