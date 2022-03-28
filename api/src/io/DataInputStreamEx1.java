package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream / DataOutputStream : 메모리에 저장된 0, 1 상태 읽기 쓰기
// 4 => writeInt(4) 하면 텍스트 형태의 숫자 4에서 4바이트 자료형의 4가 되는 거.
// 이걸 해주기 가장 좋은 스트림

public class DataInputStreamEx1 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt"); // 아웃풋이 인풋보다 아래에 있으면 파일 없을 때 먼저 쓰고 읽고가 되어서
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("c:\\temp\\data.txt");
			DataInputStream dis = new DataInputStream(fis);){
			
			// 자료형에 맞게 자료 작성
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(5);
			
			dos.writeUTF("김자바");
			dos.writeDouble(96.5);
			dos.writeInt(6);
			
			// 읽어오기
			for (int i=0;i<2;i++) {
				String name = dis.readUTF();
				double jumsu = dis.readDouble();
				int num = dis.readInt();
				System.out.println(num+" : "+name+"("+jumsu+")");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
