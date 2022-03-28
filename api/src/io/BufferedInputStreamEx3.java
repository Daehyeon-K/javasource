package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
		
			int data;
			while ((data=bis.read())!=-1) { // 한 바이트 씩 읽어온 것. 근데 배열이 편하다 했음. 버퍼가 입출력 향상은 맞지만, 바이트 배열로 한 번에 읽는게 더 빠름
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
