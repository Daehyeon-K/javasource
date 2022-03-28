package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) {
		// 입력: 키보드
		InputStream in = System.in; // System.in은 키보드, System.out은 화면
		int input = 0;
		
		try {
			while ((input = in.read())!=-1) { // 이거 한 바이트만 읽기 때문에, abc 이렇게 적으면 a만 나옴 // 한글은 깨짐
			System.out.println((char)input); // int를 유니코드 따라서 나오게 가능
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 스트림 해제 작업
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

