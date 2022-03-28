package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceEx2 {
	public static void main(String[] args) {
		// FileInputStream + BufferedInputStream 사용 시
		try (FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);){
					
			long start = System.currentTimeMillis();
			while (bis.read()!=-1) {}
			long end = System.currentTimeMillis();
					
			System.out.println("FileInputStream + BufferedInputStream 사용 시 "+(end-start));
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileOutputStream + BufferedOutputStream + 사용 입출력 시
		try (FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy2.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
							
			int data;
			long start = System.currentTimeMillis();
			while ((data=bis.read())!=-1) { bos.write(data); }
			long end = System.currentTimeMillis();
											
			System.out.println("FileOutputStream + BufferedOutputStream 사용 입출력 시 "+(end-start));
											
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream + byte 배열 사용 시
		try (FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);){
			
			byte data[] = new byte[4096];
							
			long start = System.currentTimeMillis();
			while (bis.read(data)!=-1) {}
			long end = System.currentTimeMillis();
							
			System.out.println("FileInputStream + BufferedInputStream + byte 배열 사용 시 "+(end-start));
							
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileOutputStream + BufferedOutputStream + byte 배열 사용 입출력 시
		try (FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy2.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
					
			byte data[] = new byte[4096];
									
			long start = System.currentTimeMillis();
			while (bis.read(data)!=-1) { bos.write(data); }
			long end = System.currentTimeMillis();
									
			System.out.println("FileOutputStream + BufferedOutputStream + byte 배열 사용 입출력 시 "+(end-start));
									
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
