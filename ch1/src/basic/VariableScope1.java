package basic;

// 변수 유효 범위
// 변수 선언 위치에 따라 영향 범위가 다름
// 전역(클래스 내부에 선언)과 지역({} : 블록 안에서 선언)

public class VariableScope1 { //클래스 블록
	
	//int age; //클래스 내부에 선언 //이후에 클래스 내부 선언 다시 배울 것
	
	public static void main(String[] args) { //메인 메소드 블록
		//메소드 내부에서 선언 - 지역(로컬)변수
		int age = 4;
		int v1 = 3;
		
		{ //메소드 내부 블록
			//int age = 3; // 전역과 지역 사이엔 같은 변수명 사용 가능
			// -> 지역과 같은 지역에선 같은 변수명 사용 불가
			
			int id = 20220302;
			//int id = 20220303; -> Duplicate local variable age
			// -> 지역과 같은 내부 지역에서도 당연히 같은 변수명 사용 불가
			
			v1 = age + 30;
			// 선언이 아닌 값을 대입하는 것이기에 당연히 가능
			
			int v2 = 45;
			System.out.println("id = "+id+"\nv2 = "+v2);
			
		}
		System.out.println("v1 = "+v1);
		//System.out.println("v2 = "+v2);
		// 같은 메소드 블록 내에 있는 듯 하지만, 이 블록 내부의 메소드에 선언된 지역변수이기에 블록을 벗어나 사용 불가
	}
	
	public static void print() { //새로운 메소드
		//System.out.println("age = "+age);
		// -> 다른 메소드(블록)에서 선언된 거라 사용이 불가
	}
	
}
