package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 외우기
		System.out.println(sdf.format(date1)); // 외우기
		
		Calendar today = Calendar.getInstance();
		System.out.println("올해 연도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11) : "+today.get(Calendar.MONTH));
		System.out.println("이 달의 몇 번째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("현재 시 : "+today.get(Calendar.HOUR));
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		
		
	}
}
