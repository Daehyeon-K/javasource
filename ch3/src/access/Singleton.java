package access;

// 싱글톤 패턴
// 1. 생성자 private으로 작성
//    - private으로 명시 안하면 public 접근제한자를 가지는 디폴트 생성자 가지니 꼭 만들어주기
// 2. 클래스 내부에 static으로 유일한 인스턴스 생성
//    - 그리고 private으로 막기
// 3. 외부에서 참조 가능한 public 메소드 작성
//    - public static으로 시작해서, 싱글톤 체크하고 객체 생성하고 리턴해주는
//    - 이름은 주로 getInstance()

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		
		
		return singleton;
	}
}
