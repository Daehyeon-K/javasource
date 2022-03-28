package condition;

// if
// else if
// else

public class IfEx2 {
	public static void main(String[] args) {
		int score = 90;
		
		// score가 90 이상이면 메시지 출력
		// score가 90 미만이면 메시지 출력
		
		if (score >= 90) {
			System.out.println("점수는 90 이상입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else {
			System.out.println("점수는 90 미만입니다.");
			System.out.println("등급은 B 입니다.");
		}
		// if 두개는 조건 검사도 두 번 하니까 이게 낫긴 하다.

	}
}
