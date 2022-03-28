package access;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance(); // static이니 클래스명.메소드로
		Singleton obj2 = Singleton.getInstance();
		
		Account account1 = new Account("110-890-358029", "권재민", 1000);
		Account account2 = new Account("110-890-358029", "권재민", 1000);
		
		System.out.println("싱글톤 : "+(obj1 == obj2)); // true	
		// 직접은 아니어도 내부에서 객체 생성해서 나온 거
		// 그런데 같다는 것은, 여기서 주소가 같다고 나온 것
		// => 객체 하나만 만들어서 쓰겠다는 것 (단 하나의 인스턴스만 사용)
		// => 스프링 구현 시 사용되는 개념
		
		System.out.println("일반 : "+(account1 == account2)); // false
		
		
	}
}
