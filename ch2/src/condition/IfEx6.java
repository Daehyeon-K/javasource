package condition;

public class IfEx6 {
	public static void main(String[] args) {
		// 주사위 프로그램
		// System.out.println(Math.random());
		
		// 0.0 <= Math.random() < 1.0
		
		int dice = (int)(Math.random()*6)+1; // 형 변환 안하면 double 이니까, 6 곱해서 0~5.99..., 1 더하고 정수부 취함
		
		if (dice == 1) {
			System.out.println("주사위 눈 : 1");
		}
		else if (dice == 2) {
			System.out.println("주사위 눈 : 2");
		}
		else if (dice == 3) {
			System.out.println("주사위 눈 : 3");
		}
		else if (dice == 4) {
			System.out.println("주사위 눈 : 4");
		}
		else if (dice == 5) {
			System.out.println("주사위 눈 : 5");
		}
		else {
			System.out.println("주사위 눈 : 6");
		}
		
	}
}
