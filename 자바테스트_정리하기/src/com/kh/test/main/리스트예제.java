package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {
	public static void main(String[] args) {
		//ArrayList 생성
		ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList("바나나", "오렌지"));
		//값추가
		리스트.add("사과");
		
		System.out.println(리스트);
		리스트.remove("바나나");
		리스트.remove(0);
		System.out.println(리스트);//사과만 남음 사과는 2번 인덱스에서 0번 인덱스로 옮겨짐
		
		//값 변경
		리스트.set(0, "체리");
		System.out.println(리스트);
		
		리스트.add(2,"파파야");
		System.out.println(리스트);
		
		System.out.println(리스트.size());
		
		System.out.println(리스트.contains("파파야:"));
		
		System.out.println("");
	}
}
