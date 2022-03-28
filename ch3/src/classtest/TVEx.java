package classtest;

public class TVEx {
	public static void main(String[] args) {
		// 객체 생성
		TV tv1 = new TV();
		// 초기화
		tv1.color = "black";
		tv1.channel = 3;
		tv1.power = false;
		
		// 객체 사용
		tv1.power(); // 전원켜기
		System.out.println("현재 전원 상태 : "+tv1.power);
		System.out.println("현재 채널 : "+tv1.channel);
		tv1.channelUp(); // 채널 번호 증가
		System.out.println("현재 채널 : "+tv1.channel);
		
	}
}
