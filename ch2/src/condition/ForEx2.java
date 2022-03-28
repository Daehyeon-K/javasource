package condition;


public class ForEx2 {
	public static void main(String[] args) {
//		for(int i=0; i<3;i--) {
//			System.out.println("Hi");
//		}
		// 무한루프 걸림. 항상 조건 만족하니까
		
		// 1~10 출력
		for(int i=1;i<11;i++) {
			System.out.println("i : "+i);
		}
		
		// 10~1 출력
		for(int i=10;i>0;i--) {
			System.out.println("i : "+i);
		}
	}
}
