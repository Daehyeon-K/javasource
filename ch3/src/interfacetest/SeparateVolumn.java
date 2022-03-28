package interfacetest;

public class SeparateVolumn implements Lendable {
	// 일반 클래스니 멤버 변수 선언 가능
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	int state;
	
	public SeparateVolumn(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*** "+bookTitle+"이(가) 대출되었습니다. ***");
		System.out.println("대출자 : "+borrower);
		System.out.println("대출일 : "+date);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*** "+bookTitle+"이(가) 반납되었습니다. ***");
	}

}
