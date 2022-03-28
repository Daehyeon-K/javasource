package extend;

// CellPhone : 핸드폰의 기장 기본 기능이 담긴 클래스 (model, color || on/off, ring, message, hangUp)
// DMBCellPhone : CellPhone, DMB 추가

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String msg) {System.out.println("본인 : "+msg);}
	void receiveVoice(String msg) {System.out.println("상대방 : "+msg);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	
	
}
