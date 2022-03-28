package thread;

// 멀티 스레드
// CPU 사용률 향상
// 자원 효율적으로 사용
// 작업이 분리되어 코드가 간결

// 카톡의 경우에 메시지 전송, 이모티콘 전송, 파일 주고받기 등

public class BigLetters {
	public static void main(String[] args) {
		
		// 같이 수행할 클래스 지정
		SmallLetters t1 = new SmallLetters();
		t1.start(); // run을 직접 부르지는 않지만 수행해주는 것
		
		Runnable r = new NumPrint();
		Thread t2 = new Thread(r);
		t2.start();
		
		
		// 대문자 A~Z 출력
		for (char ch='A'; ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		
	}
}