package condition;

// 같은 리턴을 주는 여러 결과가 있는 경우에 대한 케이스 병렬

public class SwitchEx3 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A': case 'a':
			System.out.println("우수회원");
			break;
		case 'B': case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
		}

	}
}
