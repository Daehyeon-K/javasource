package classtest;

public class PhysicalInfoEx {
	public static void main(String[] args) {
		PhysicalInfo p1 = new PhysicalInfo("이몽룡", 27, 176.8, 72.3);
		PhysicalInfo p2 = new PhysicalInfo("성춘향", 31, 162.1, 54.1);
		p1.printData();
		p2.printData();
		
		p1.update(26);
		p1.printData();
		
		
		
	}
}
