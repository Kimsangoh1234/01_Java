package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		1부터 9까지 값을 스캐너로 각각 입력받아 
		
		더하기 빼기 곱하기 몫 출력하기
		
		int 숫자1
		int 숫자2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오. : ");
		int 숫자1 = sc.nextInt();
		if(숫자1<1 || 숫자1>9) {
			System.out.println("1부터 9 사이의 정수를 입력하세요.");
			return; 
		}
		
		System.out.println("다른숫자를 입력하시오. : ");
		int 숫자2 = sc.nextInt();
		if(숫자2<1 || 숫자2>9) {
			System.out.println("1부터 9 사이의 정수를 입력하세요.");
			return;
		}
		
		
		int 합 = 숫자1+숫자2;
		int 빼기 = 숫자1-숫자2;
		int 곱 = 숫자1*숫자2;
		int 몫 = 숫자1/숫자2;
		
		System.out.println(숫자1+ "+"+숫자2+"="+합 );
		System.out.println(숫자1+ "-"+숫자2+"="+빼기 );
		System.out.println(숫자1+ "*"+숫자2+"="+곱 );
		System.out.println(숫자1+ "/"+숫자2+"="+몫);
	}
}
