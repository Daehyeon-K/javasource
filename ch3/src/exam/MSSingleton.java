package exam;

public class MSSingleton {
	
	private String id="hong";
	private String password="12345";
	
	private MSSingleton() {}
	
	public static MSSingleton getInstance() {
		return LazyHolder.instance;
	}
	
	private static class LazyHolder {
		private static final MSSingleton instance = new MSSingleton();
	}	
	
	public boolean login(String id, String pw) {
		if (id.equals(this.id) && pw.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// logout: 매개변수(인자)는 없음/리턴타입 없음
	//			로그아웃 되었습니다. 메시지 출력
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
