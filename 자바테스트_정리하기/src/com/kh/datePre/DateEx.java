package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Date로 현재 날짜를 받아서 년 월 일 출ㄹ력하기
		//Date는 최초 1회만 호출 a
		
		Date NOW1 = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatdate = sdf1.format(NOW1);
		System.out.println("년-월-일 : "+formatdate);
		
		try {
			Date parseDate1 = sdf1.parse(formatdate);
			System.out.println(parseDate1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatdate2 = sdf2.format(NOW1);
		System.out.println("시 분 초 : "+formatdate2);
		
		try {
			Date parseDate2 = sdf2.parse(formatdate2);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatdate3=sdf3.format(NOW1);
		System.out.println("년-월-일 시 분 초 : "+formatdate3);
		String 문자열 = "2024-05-03 11:14:04";
		try {
			Date parseDate3 = sdf3.parse(문자열);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
