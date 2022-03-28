package condition;

// 조건문

public class IfEx1 {
	public static void main(String[] args) {
		int num = 10;
		
		// num == 0 => 숫자는 0입니다.
		// num != 0 => 숫자는 0이 아닙니다.
		
		if (num==0) {
			System.out.println("숫자는 0입니다.");
		}
		else if (num!=0){
			System.out.println("숫자는 0이 아닙니다.");
		}
		// 사실 한 줄 수행문은 블럭 없이 가능. 다만 실수 가능하니 블럭 ㄱㄱ

	}
}
