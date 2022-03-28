package classtest;

public class SubscriberInfoEx2 {
	public static void main(String[] args) {
		// SubscriberInfo 객체를 담을 배열 생성
		SubscriberInfo info[] = new SubscriberInfo[3];
		
		// 생성된 배열에 SubscriberInfo 객체 생성 후 담기
		info[0] = new SubscriberInfo("이몽룡", "a1", "1234");
		info[1] = new SubscriberInfo("성춘향", "b1", "5678", "010-1234-5678", "서울시 마포구");
		info[2] = new SubscriberInfo("홍길동", "c1", "9012", "010-9876-5432", null);
		
		// int a = null; => 얘만 null 못줌. null은 참조타입의 디폴트라 그럼.
		// => 기본타입(primitive type)의 초기화는 null 불가
		// null == 값을 할당하지 않았음
		String s = null;
		TV tv = null;
		
		// 생성된 정보 확인
		print(info);
		
		System.out.println(s+tv);
	}
	
	static void print(SubscriberInfo info[]) { // 참조매개변수, 해당 인자의 주소 받아옴
		for (SubscriberInfo s:info) { // 향상된 for문이 조금 더 편함
			System.out.println("성명\t: "+s.name);
			System.out.println("아이디\t: "+s.id);
			System.out.println("비밀번호\t: "+s.password);
			System.out.println("전화번호\t: "+s.phone);
			System.out.println("주소\t: "+s.address+"\n");
		}
		
		for (int i = 0 ; i<info.length;i++) {
			System.out.println("성명\t: "+info[i].name);
			System.out.println("아이디\t: "+info[i].id);
			System.out.println("비밀번호\t: "+info[i].password);
			System.out.println("전화번호\t: "+info[i].phone);
			System.out.println("주소\t: "+info[i].address+"\n");
		}
		
	}
}
