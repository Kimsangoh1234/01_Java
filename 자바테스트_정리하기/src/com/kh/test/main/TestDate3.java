package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
/*
GregorianCalendar 클래스를 사용하여,
현재 년도와 비교한 나이를 계산하고 생일의 요일을 출력한다.
출력시 SimpleDateFormat을 사용하여 출력한다.
 */
	public static void main(String[] args) {
		//본인의 생년월일 설정
		int 태어난년도  = 1987;
		int 태어난월   = 8;
		int 태어난날짜  = 14;
		
		Calendar 현재 = Calendar.getInstance();
		int 현재년도 = 현재.get(Calendar.YEAR);
		int 현재월 = 현재.get(Calendar.MONTH)+1	;
		int 현재날짜 = 현재.get(Calendar.DAY_OF_MONTH)	;
		
		int 나이 = 현재년도 - 태어난년도;
		//생일 전이면 나이 -1
		//만약에 현재는 4월인데 내 생일 8월 14
		//
		if(현재월<태어난년도 || (태어난월==현재월 && 현재날짜 <태어난날짜)) {
			나이--;
		}
		//생일요일계산
		Calendar 생일 = new GregorianCalendar(태어난년도, 태어난월 =1, 태어난날짜);
		SimpleDateFormat 날짜예쁘게작성 = new SimpleDateFormat("yyyy년 m월 d일 EEEE");
		
		System.out.println("생일 : "+날짜예쁘게작성.format(생일.getTime()));
		System.out.println("현재 : "+날짜예쁘게작성.format(현재.getTime()));
		System.out.println("나이 : "+나이);
		
	}
}
