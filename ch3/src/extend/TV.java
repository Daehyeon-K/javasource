package extend;

// CaptionTV 클래스 만들어야 할 때 : 자막 기능이 있는 TV
// 새 클래스를 만들어서 옮기고 추가 기능을 넣는 대신 상속받는 클래스를 만들어 옮길 필요없이 기능만 추가하도록 하는 것

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	// 기능: 전원 on/off, 채널 변경
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}
