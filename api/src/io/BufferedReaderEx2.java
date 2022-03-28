package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		// 자바 소스 파일을 읽어서 화면에 출력
		// 같은 폴더니까 src\\io\\PerformanceEx2.java
		// 출력문 앞에 번호를 붙여서 화면에 보여주기
		
		try (Reader r = new FileReader("src\\io\\PerformanceEx2.java");
				BufferedReader br = new BufferedReader(r);) {
			
			String str = null;
			int i = 1;
			while ((str = br.readLine()) != null) {
				System.out.println((i++)+" | "+str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
