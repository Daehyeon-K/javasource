package condition;

// 반복문, while

public class WhileEx1 {
	public static void main(String[] args) {
		// for (int i=1; i<=10; i++){ }
		// while로 바꾸면 아래와 같다
		// 초기화; while(조건식) {수행문, 증감식}
		
		int i = 1;
		while (i<=10) {
			System.out.println("i = "+i);
			i++;
		}

	}
}
