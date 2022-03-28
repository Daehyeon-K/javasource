// prac2

package exam;

public class IPTV extends ColorTV {
	private String ip;
	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
		
	}
	
}
