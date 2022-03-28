package condition;

public class DiceSum {
	public static void main(String[] args) {
		// while, math.random 사용
		// 주사위 2개 던져서 나오는 값을 값1, 값2 형태로 출력
		// 두 값의 합이 5가 아니면 계속 던지고, 5면 종료하는 프로그램
		
		int n1, n2;
		while (true){
			n1=(int)(Math.random()*6)+1;
			n2=(int)(Math.random()*6)+1;
			
			System.out.printf("두 주사위의 눈: (%d, %d)\n", n1, n2);
			
			if (n1 + n2 != 5) {
				System.out.printf("두 값의 합은 %d입니다.\n두 값의 합이 5가 아니기에 주사위를 다시 굴립니다\n\n", n1+n2);
				continue;
			}
			
			else {
				System.out.printf("두 값의 합은 %d입니다.\n두 값의 합이 5가 맞기에 프로그램을 종료합니다.", n1+n2);
				break;
			}
		}	
	}
}
