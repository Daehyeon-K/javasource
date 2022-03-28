package classtest;

public class TV2 {
	// 속성: 모델명, 가격, 색상, 가로길이, 세로길이, 전원 상태, 채널 상태
	String color;
	boolean power;
	int channel;
	
	// 생성자를 따로 명시하지 않으면 디폴트 생성자 만들어 줌. new 할때 생성자 할 때 안 할 때가 있는게 아님
	public TV2 (String color) {
		this.color = color;
	}
	
	public TV2 (String color, boolean power) {
		this.color = color;
		this.power = power;
	}
	
	public TV2 (String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	// 이렇게 디폴트 없이 인자 있는 생성자만 여러 개 만들 수도 있음.
	
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
