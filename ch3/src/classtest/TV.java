package classtest;

public class TV {
	// 속성: 모델명, 가격, 색상, 가로길이, 세로길이, 전원 상태, 채널 상태
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
