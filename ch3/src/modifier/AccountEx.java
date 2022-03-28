package modifier;


//import : 다른 패키지에 있는 클래스 사용 시 필요
//자바에서 제공하는 패키지 중 java.lang 패키지는 import 구문 없이 사용 가능

import classtest.Account; // 이 패키지 불러와야 Account 클래스 사용 가능


public class AccountEx {
	public static void main(String[] args) {
		Account a1 = new Account(null,null,0);
		House h1 = new House(); // 같은 패키지 안에 있기에 접근제한자에 따라 import 없이 사용 가능
		System.out.println(a1+" "+h1);
	}
}
