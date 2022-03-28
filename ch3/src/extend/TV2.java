package extend;

// CaptionTV 클래스 만들어야 할 때 : 자막 기능이 있는 TV
// 새 클래스를 만들어서 옮기고 추가 기능을 넣는 대신 상속받는 클래스를 만들어 옮길 필요없이 기능만 추가하도록 하는 것

public class TV2 {
	
	private String color;
	private boolean power;
	private int channel;
	
	public TV2(String color, boolean power, int channel) {
		super(); // 모든 클래스의 부모 클래스인 Object 클래스 호출하는 것 (ctrl space에서 나오는 Object 클래스)
		this.color = color;
		this.power = power;
		this.channel = channel;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

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
