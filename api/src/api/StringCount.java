package api;

public class StringCount {
	public static void main(String[] args) {
		String str1 = "aabbccAABBCCaa";
		
		int cnt1 = count(str1, "aa", 0, 0);
		System.out.println("원본 문자열에 aa 패턴이 "+cnt1+"개 나왔습니다.");
		
		int cnt2 = count2(str1, "aa", 0);
		System.out.println("원본 문자열에 aa 패턴이 "+cnt2+"개 나왔습니다.");
		
		int cnt3 = count3(str1, "aa");
		System.out.println("원본 문자열에 aa 패턴이 "+cnt3+"개 나왔습니다.");
	}
	
	public static int count3(String src, String key) {
		if (src.length()==0) {
			return 0;
		}
		src = src.substring(key.length());
		
		return count3(src, key);
		
	}
	
	public static int count(String src, String key, int pos, int cnt) {
		
		// 재귀로 하면 이 프레임에선 조건이 너무 복잡해짐. 반복이 나음.
		// 오히려 aa, 즉 두개 단위로 서브스트링 만들며 재귀하는 게 나을 듯.
		// 유연하게 확장 및 해결
		
		// 원본 문자열 src에서 key에 해당하는 패턴 몇 번 나왔는 지 계산
		
		if (key == null || key.length()==0) { return -1; }
		
		if (!src.contains(key) && pos > src.length()) {
			return 0;
			
		} else if (src.contains(key) && pos > src.length()) {
			return 1;
		}
		
		if (src.contains(key) && pos < src.length()) cnt++;
		
		return count(src, key, pos+=key.length(), cnt);
	

	}
	
	public static int count2(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length()==0) { return -1; }
		
		while((index = src.indexOf(key, pos))!=-1) {
			count++;
			pos = index+key.length();
		}
		return count;
	}
}
