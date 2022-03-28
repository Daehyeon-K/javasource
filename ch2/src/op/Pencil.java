package op;

public class Pencil {
	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 당
		// 몇 자루를 가질 수 있고 최종적으로 몇 개가 남는 지 출력하시오.
		// 변수 사용, 산술 연산자 사용
		
		int pen = 534;
		int stu = 30;
		
		System.out.println("학생 당 가질 수 있는 연필: "+(pen/stu)+"자루");
		System.out.println("남는 연필: "+(pen%stu)+"자루");
		

	}
}
