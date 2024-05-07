package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		Date Now = new Date();
		
		System.out.println(Now);
		//Fri May 03 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatData = sdf.format(Now);
		System.out.println(formatData);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM 월 dd일");
		String formatSdf2 = sdf2.format(Now);
		System.out.println(formatSdf2);
		
		//문자열(SimpleDateFormat - String)을 날짜(Date)로 변경
		String 문자열 =  "2024-4-30 15:30ㅣ45";
	}
	
}
