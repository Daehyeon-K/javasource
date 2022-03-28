package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		
		try(InputStream in = new FileInputStream("c:\\temp\\file1.txt"); // 입력 스트림
			BufferedInputStream bis = new BufferedInputStream(in); // 보조 스트림, 입력 스트림과 연결
			OutputStream out = new FileOutputStream("c:\\temp\\output2.txt"); // 출력 스트림
			BufferedOutputStream bos = new BufferedOutputStream(out); // 보조 스트림, 출력 스트림과 연결
			){
			// BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\file1.txt"));
			// 이렇게 한 줄로도 처리 많이 함
			// BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\output2.txt"));
			// 이것도 한 줄 처리 가능
			
			// 파일 읽기 => 파일 쓰기 (버퍼에서 읽고 버퍼에서 쓰기)
			byte b[] = new byte[1024];
			while(bis.read(b)!=-1) {
				bos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
	}
}
