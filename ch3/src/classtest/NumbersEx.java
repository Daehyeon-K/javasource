package classtest;

public class NumbersEx {
	public static void main(String[] args) {
		int iArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		Numbers iArrNo = new Numbers(iArr);
		iArrNo.execute();
		
		// 이렇게 바로 선언 및 사용도 가능
		Numbers iArrNo2 = new Numbers(new int[] {13, 23, 56, 457, 23, 34, 32});
		iArrNo2.execute();
	}
}
