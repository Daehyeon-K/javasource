package exam;

public class MemberService {
	// 멤버변수: id, password
	private String id;
	private String password;
	
	// default 생성자 하나
	public MemberService() {
		super();
		this.id = "hong";
		this.password = "12345";
	}
	
	// 메소드: 리턴타입-boolean 이름: login
	// login: id, password 받아서 id가 hong이고 password가 12345인 경우만 true 리턴, 이외엔 false
	boolean login(String id, String pw) {
		if (id.equals(this.id) && pw.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// logout: 매개변수(인자)는 없음/리턴타입 없음
	//			로그아웃 되었습니다. 메시지 출력
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
