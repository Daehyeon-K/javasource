package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class InputStreamEx4 {
	public static void main(String[] args) {
		// 입력: 키보드, 출력: 화면
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte arr[] = new byte[100];
		int i=0;
		
		try {
			while ((in.read(arr))!=-1 && i<1) {
				i++;
			}
			
			out.write(arr);
			System.out.println("\n"+Arrays.toString(arr)); // 보면 다 바이트로 들어가 있는 것 알 수 있음
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
