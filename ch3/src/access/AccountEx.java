package access;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("110-890-358029", "권재민", 1000); // 같은 패키지이기에 문제 X
		
		// System.out.println("계좌번호 : "+account.); 해당 클래스에서 멤버변수를 private 해놔서 직접 접근 불가. 에러 발생
		System.out.println("계좌번호 : "+account.getAccountNo()); // 이렇게 getter 메소드 사용하면 됨
		System.out.println("계좌주 : "+account.getOwner());
		System.out.println("잔액 : "+account.getBalance()+"\n");
		
		account.setAccountNo("110-461-156485");
		account.setOwner("권대현");
		account.setBalance(20000);
		
		System.out.println("계좌번호 : "+account.getAccountNo());
		System.out.println("계좌주 : "+account.getOwner());
		System.out.println("잔액 : "+account.getBalance()+"\n");
	}
}
