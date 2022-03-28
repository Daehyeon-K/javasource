package classtest;

public class TVEx2 {

	public static void main(String[] args) {
		// TV2 tv =new TV2(); -> 오류 나는 이유가, 디폴트, 즉 이 형식에 맞는 생성자가 없어서.
		// 괄호 안에 뭐 없이 클래스 생성 == 디폴트 생성자를 이용해서 만들어라.
		// 또한, 별도로 생성자를 만들어줘서 디폴트 생성자가 자동 생성 되지도 않음
		
		TV2 tv = new TV2("white", false, 3);
		tv.channelUp();
	}

}
