package api;

public class Reverse {
	public static void main(String[] args) {
		String str = "ABzquartK";
		
		// 거꾸로 출력
		for (int i = str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// 한 번에 문자열을 캐릭터 배열로 처리
		char[] chArr = str.toCharArray(); 
		for (int i = chArr.length-1; i>=0;i--) {
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		// StringBuilder reverse
		StringBuilder strB = new StringBuilder("ABzquartK");
		strB.reverse();
		System.out.println(strB);
	}
}
