package condition;

// 스위치 구조

public class SwitchEx1 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("주사위 눈 : 1");
			break;
		case 2:
			System.out.println("주사위 눈 : 2");
			break;
		case 3:
			System.out.println("주사위 눈 : 3");
			break;
		case 4:
			System.out.println("주사위 눈 : 4");
			break;
		case 5:
			System.out.println("주사위 눈 : 5");
			break;
		default:
			System.out.println("주사위 눈 : 6");
		}

	}

}
