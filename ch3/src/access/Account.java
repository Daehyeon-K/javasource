package access;

// 접근제한자
// - 객체 생성을 막아야 하는 경우
// - 특정 메소드 호출 못하게 하는 경우
// - 객체 속성을 외부에서 함부로 변경 못하게 하는 경우

// private < default(package) < protected < public

// 클래스 접근 제한 : public(같은 패키지, 다른 패키지), default(같은 패키지만 허용)

// 멤버 변수의 접근제한 (접근제한자 모두 사용 가능)
// ==> private: 같은 패키지건 다른 패키지건 상관 없이 멤버변수 사용불가
// 				속성의 값 변경을 위해서는 메소드를 통해서만 제공
//				직접 변경하는 것은 허용하지 않기 위해

public class Account { // public 없애고 class Account면 default 상황. 아이콘도 달라짐
	// 속성: 계좌번호, 소유주, 잔액
	private String accountNo, owner;
	private long balance;
	
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
	
	long withdraw(long amount) {
		this.balance -= amount;
		return balance;
	}
	
	// getter 메소드
	// private으로 설정된 변수에 대해 외부에서 직접 접근은 불가능한 상황임
	// 해당 변수값을 리턴하는 기능
	public String getAccountNo() {
		return accountNo;
	}
	public long getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	
	// setter 메소드
	// 직접 변경하지 말고, 메소드를 통한 변경 (매개값의 유효성 검증한 후 변경)
	// 조건을 달아서, 예를 들면 정규식 써서 검정 가능
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	


}
