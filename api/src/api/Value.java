package api;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value=value;
	}
	
	// 주소 비교가 아닌 값의 비교로 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value) { // 위의 Object obj = value2가 된거니까 instanceof는, obj를 Value 객체로 변환 가능한 지 확인하는 코드
									// 캐스팅 잘못하면 Exception 뜨니까. 못바꾸면. 그거 안나게 미리 확인하는 것.
			
			Value v = (Value) obj; // 여기서 원래 타입으로 강제 형변환
			
			if (this.value == v.value) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	
	
	
}
