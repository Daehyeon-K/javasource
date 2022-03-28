package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterEx2 {
	public static void main(String[] args) {
		// 사용자로부터 데이터 입력 받기 : Scanner 사용
		// output1.txt 파일 생성
		// 입력받은 데이터를 파일로 쓰기 : output1.txt 파일에 저장
		
		File f1 = new File("c:\\temp\\output1.txt");
		
		if (!f1.exists()) {try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} }
		
		Scanner sc = new Scanner(System.in);
		
		try (Writer writer = new FileWriter(f1, true)){
			while (true) {
				System.out.print("데이터를 입력해주세요. (종료는 q) >> ");
				String line = sc.nextLine();
				if (line.equals("q") || line.equals("Q")) {break;}
				writer.write(line+"\r\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
