package extend;

public class CaptionTV2 extends TV2 { // 아래 주석된 부분은 어차피 TV에 있어서 상속받아 그대로 쓰면 되는 것

//	String color;
//	boolean power;
//	int channel;
	 
//	public CaptionTV2() {
//		super(); // 부모의 default 생성자를 호출
//	}
	// Implicit super constructor TV2() is undefined for default constructor.
	// Must define an explicit constructor
	// => 부모 클래스 생성자 관련 문제임. 디폴트가 만들어지는 게 아니라서
	// => 부모는 인자 있는 생성자인데 여기엔 인자 없는 디폴트 자동생성만 하려고 하니까
	// => 즉, 부모 자식간에 생성자 안맞는 경우 문제가 생긴다. 맞춰줘야 한다.
	
	
	// 캡션 기능
	boolean caption;
	
	public CaptionTV2(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel); // 부모 생성자 호출해서 만드는 것
		// 부모 자식간에 생성자 안맞으면 문제가생기는 거라 맞춰내야 하는 거.
		
		this.caption = caption;
	}
	
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
