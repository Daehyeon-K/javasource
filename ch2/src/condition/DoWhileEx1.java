package condition;

import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {
		// for(int i=10; i<1; i--) {} 하면 조건이 다르니 수행이 아예 안됨
		// 조건 검사가 먼저이기에. while 역시 마찬가지
		
		// 1 ~ 100 사이의 임의의 숫자 만들기
		// 입력을 받아 이걸 맞추는 프로그램
		// 이 경우 적어도 한 번은 입력을 받고 초기화가 들어가야 함
		// 다른 반복문으로 못 만드는 건 아니지만 do while이 좀 더 깔끔하다
		
		int cAnswer = (int)(Math.random()*100)+1;
		int pAnswer;
		System.out.println("1부터 100사이의 임의의 정수가 생성되었습니다!");
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1부터 100사이의 임의의 정수를 맞춰보세요! : ");
			pAnswer = sc.nextInt();
			if (cAnswer > pAnswer) {
				System.out.println(pAnswer+"은(는) 오답입니다.. 정답은 더욱 큽니다.");
			}
			
			else if (cAnswer < pAnswer) {
				System.out.println(pAnswer+"은(는) 오답입니다.. 정답은 더욱 작습니다.");
			}
			else {
				System.out.println("\""+pAnswer+"\" 정답입니다! 축하합니다!");
			}
			
			
		} while(cAnswer!=pAnswer); // 세미콜론에 주의
		
		sc.close();
	}
}
