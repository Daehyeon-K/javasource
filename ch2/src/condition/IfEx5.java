package condition;

// 조건이 여러개인 경우
// if, else if, else

public class IfEx5 {
	public static void main(String[] args) {
		// 점수가 90 이상이면 A
		// 점수가 80 이상이면 B
		// 점수가 70 이상이면 C
		// 점수가 60 이상이면 D
		
		int score = 59;
		
		if(score>=90) {
			System.out.println("A 등급입니다.");
		}
		else if(score>=80) {
			System.out.println("B 등급입니다.");
		}
		else if(score>=70) {
			System.out.println("C 등급입니다.");
		}
		else if(score>=60){
			System.out.println("D 등급입니다.");
		}

	}
}
