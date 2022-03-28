package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		try(// 안 깨지면 Reader in = new FileReader("c:\\temp\\file1.txt"); // 입력 스트림
			// 깨지면 InputStreamReader in new InputStreamReader(new FileInpurStream(주소), "ms949")
				
			InputStreamReader in = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "ms949");
			BufferedReader bis = new BufferedReader(in); // 보조 스트림, 입력 스트림과 연결
			Writer out = new FileWriter("c:\\temp\\output2.txt"); // 출력 스트림
			BufferedWriter bos = new BufferedWriter(out); // 보조 스트림, 출력 스트림과 연결
			){
			
			String str = null;
			while((str=bis.readLine())!=null) {
				bos.write(str);
				bos.newLine(); // 엔터
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
	}
}
