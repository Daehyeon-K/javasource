package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		// 입력: 파일, 출력: 화면
		try (Reader reader = new FileReader("c:\\temp\\file1.txt")) { // == InputStream
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) { // reader가 두 종류 에러 가능하대서 두 개 잡아주는 중
			e1.printStackTrace();
		} 
	}
}
