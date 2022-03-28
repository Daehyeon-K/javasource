package condition;

// break: 반복문 수행 중지
// 중첩 반복문의 경우 제어문이 위치한 블럭의 반복문 제어

public class BreakEx2 {

	public static void main(String[] args) {
		// 주사위 6 나오면 반복문 종료
		
		int dice;
		
		while(true) {
			dice = (int)(Math.random()*6)+1;
			System.out.println("The dice has been cast : "+dice);
			if (dice==6) {break;}
		}
		System.out.println("Six there, it's over.");
	}

}
