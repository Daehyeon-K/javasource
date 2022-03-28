package classtest;

public class PersonEx {

	public static void main(String[] args) {
		Person person = new Person("012345-6789012", "이몽룡");
		
		System.out.println("국적\t: "+person.nation);
		System.out.println("주민번호\t: "+person.ssn);
		System.out.println("이름\t: "+person.name+"\n");
		
		// person.ssn = "012345-2109876"; => 변경 불가능이라 에러 메시지
		person.name = "이위화";
		System.out.println("국적\t: "+person.nation);
		System.out.println("주민번호\t: "+person.ssn);
		System.out.println("이름\t: "+person.name+"\n");
	}

}
