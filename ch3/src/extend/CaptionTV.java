package extend;

public class CaptionTV extends TV { // 아래 주석된 부분은 어차피 TV에 있어서 상속받아 그대로 쓰면 되는 것

//	String color;
//	boolean power;
//	int channel;
	
	// 캡션 기능
	boolean caption;
	void display (String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
//	// 기능: 전원 on/off, 채널 변경
//	void power() {
//		power = !power;
//	}
//	
//	void channelUp() {
//		channel++;
//	}
//	
//	void channelDown() {
//		channel--;
//	}
	
}
