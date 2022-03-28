package poly;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		// 부모-자식관계
		// parent 변수가 접근한 수 있는 범위는 부모 클래스에 있는 필드와 메소드
		// 단, 오버라이딩 된 메소드가 있다면, 자식 클래스의 메소드가 대신 호출됨
		Parent parent = new Child();
		parent.method1();
		parent.method2(); // 부모에게도 있으나, 먼저 자식 메소드가 불려짐. 이 부분 때문에 씀
		// parent.method3(); => 자식 메소드라 아예 접근이 불가
		
		// Child child2 = new Parent(); 아예 컴파일이 안됨
		// Child child3 = (Child) new Parent(); 컴파일은 되지만, cast exception 뜨며 런타임 에러
		// 부모에 자식을 넣는 것만 가능하다.
		
	}
}
