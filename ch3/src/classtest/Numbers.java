package classtest;

public class Numbers {
	int num[]; // 멤버 변수(인스턴스 변수)

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	// 합계
	int sumCalc() {
		int sum=0; // 지역 변수
		for (int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	// 평균
	double avgCalc() {
		return (double)sumCalc()/num.length; // double 써서 소수점 자리도 꼭! 가져오기!!!
	}
	
	// 출력
	void execute() {
		System.out.printf("<<실행 결과>>\n합: %d\n평균: %.2f\n",sumCalc(),avgCalc());
	}
}
