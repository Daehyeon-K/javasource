package io;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("c:\\temp\\file3.txt", true)){ // 그냥 FileWriter는 다시 실행하면 기존 내용 제거하고 다시 쓰는 것
			// FileWriter에서 두번째 인자로 boolean append하면 덧붙여짐
			
			// 엔터: 타자기 한 줄 올리고(줄바꿈) 커서 맨 앞으로 이동
			// 이 두 동작으로 이뤄진 것
			
			
			writer.write("FileWriter는 한글로 된\r\n"); // 기존처럼 \n 엔터 넣으면 안들어감 인코딩 문제. \r\n 해주기
			writer.write("문자열을 출력할 수 있다.\r\n");
			writer.write("Writer 클래스는 문자 단위의\r\n");
			writer.write("출력만 가능합니다\r\n");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
