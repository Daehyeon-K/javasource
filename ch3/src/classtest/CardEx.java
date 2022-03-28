package classtest;

public class CardEx {
	public static void main(String[] args) {
		System.out.println(Card.width+" & "+Card.height);
		// 클래스 변수(static)는 클래스가 메모리에 올라갈 때, 즉 컴파일이 끝나고 메모리에 올라갈 때 생성됨
		// 그래서 객체 생성 (new) 없이 호출 가능
		
		Card card1 = new Card("Heart", 7);
		Card card2 = new Card("Spade", 4);
		Card card3 = new Card("Heart", 8);
		
		card1.println();
		card2.println();
		card3.println();
		
		System.out.println(Card.width+" & "+Card.height);
		// static하게 써달라고 노란 줄
		// static이 붙으면 모든 static은 그 앞에 클래스 명으로 접근하는 게 맞음. 변수명 말고
		
		System.out.println(Card.width+" & "+Card.height);
		// 이런 식으로 클래스 명으로 접근
		
		// 카드가 더 작아졌을 때
		Card.width = 50;
		Card.height = 80;
		
		card1.println();
		card2.println();
		card3.println();
		System.out.println(Card.width+" & "+Card.height);
		
	}
}
