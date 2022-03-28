package condition;

// 스위치에 브레이크가 없는 경우
// 특정 시간 이후 일정 등으로 브레이크 유무 결정 가능
// 이제 스위치 불편점

public class SwitchEx2 {

	public static void main(String[] args) {
		// 8 ~ 11 사이의 정수
		
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재시간 : "+time+"시]");
		
		switch (time) {
		case 8: {
			System.out.println("출근하기");
		}
		case 9: {
			System.out.println("회의하기");
		}
		case 10: {
			System.out.println("업무보기");
		}
		default:
			System.out.println("외근나가기");
		}

	}

}
