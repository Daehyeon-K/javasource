package classtest;

// 가입자 정보
public class SubscriberInfo {
	// 속성: 이름, 아이디(문자, 숫자 함께 8자리), 패스워드(문자, 숫자, 특수문자), 전화번호(010~), 주소(문자열
	String name; 
	String id;
	String password;
	String phone;
	String address;
	
	// 생성자
	public SubscriberInfo() {
		super();
	}
	
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public SubscriberInfo(String name, String id, String password, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}	

	// 기능: 비밀번호 변경, 전화번호 변경, 주소 변경
	void setPassword(String newPassword) {
		this.password = newPassword;
	}
	void setPhone(String newPhone) {
		this.phone = newPhone;
	}
	void setAddress(String newAddress) {
		this.address = newAddress;
	}
	
}
