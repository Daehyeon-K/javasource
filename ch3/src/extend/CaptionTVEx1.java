package extend;

public class CaptionTVEx1 {
	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재채널 "+ctv.channel);
		ctv.display("Hello World");
		ctv.caption = true;
		ctv.display("Hello World");
		
		CaptionTV2 ctv2 = new CaptionTV2("Black", true, 10, true);

		// ctv2.channel = 10; => 부모(TV2)의 private 필드라 상속이 안되고, 사용 불가
		ctv2.setChannel(10); // 이렇게 앞에서와 마찬가지로 get set 메소드 이용해 간접 접근하면 됨
		
		ctv2.channelUp();
		
		// System.out.println("현재채널 "+ctv2.channel); => 부모(TV2)의 private 필드라 상속이 안되고, 사용 불가
		System.out.println("현재채널 "+ctv2.getChannel());// 이렇게 앞에서와 마찬가지로 get set 메소드 이용해 간접 접근하면 됨
		
		ctv2.display("Hello World");
		ctv2.caption = true;
		ctv2.display("Hello World");
		
	}
}
