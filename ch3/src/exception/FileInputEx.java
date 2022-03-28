package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx {
	public static void main(String[] args) {
//		FileInputStream fis=null;
		
		// 과거엔 아래처럼 처리
//		try {
//			fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally { // 자원 해제
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// 7버전 이후, 즉 최근엔 아래처럼 처리 => 자동으로 리소스 닫기. finally 역할 알아서 해줌
		try(FileInputStream fis=new FileInputStream("file.txt")){
			
		} catch (Exception e) {
			
		}
	}
}
