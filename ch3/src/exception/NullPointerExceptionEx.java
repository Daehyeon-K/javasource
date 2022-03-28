package exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		Account[] acc = new Account[2];
		
		try {
		System.out.println(acc[0].accountNo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}
	}
	
}
