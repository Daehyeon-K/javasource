package classtest;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		SubscriberInfo sub1 = new SubscriberInfo("권대현", "daehyeon", "soldesk", "010-8908-3589", "서울시 마포구");
		objectPrint(sub1);
		
		sub1.setAddress("서울시 구로구");
		objectPrint(sub1);
		
		sub1.setPassword("nowhere");
		objectPrint(sub1);
		
		sub1.setPhone("010-1234-5678");
		objectPrint(sub1);
		
		
	}
	
	static void objectPrint(SubscriberInfo sub1) { // 반복 작업 시 간단하게 구현하기 위해 메소드 만든다
		System.out.println("새 회원 정보 |\t 이름 |\t 아이디 |\t\t 비밀번호 |\t 휴대폰 번호 |\t 주소 |\n"+"\t\t"+sub1.name+"\t"+sub1.id+"\t"+sub1.password+"\t\t"+sub1.phone+"\t"+sub1.address+"\n");
	}// 여기서 메인 안에 선언한 거 인자로 쓰거나 하면 사용이 안됨. 변수 유효 범위가 다르니까
	// 또한, 인자 타입 꼭 맞추기
}
