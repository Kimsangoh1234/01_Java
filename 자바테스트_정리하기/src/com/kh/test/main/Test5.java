package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		/*
		키보드로 2개의 정수형 데이터를 입력받아
		두 수가 모두 1부터 9까지의 수일 때만 
		두 수의 곱이 한자리 수인지 두자리ㅏ 수인지를 출력한다.
		 */
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요. : ");
		int 숫자1=스캐너.nextInt();
		System.out.println("정수를 입력하세요. : ");
		int 숫자2=스캐너.nextInt();
		if(숫자1>=1 && 숫자1<=9 && 숫자2>=1 && 숫자2<=9) {
		int 곱 = 숫자1*숫자2;
		//두 수가 모두 1부터 9까지의 수인지 한 번에 확인!
		if(곱>=1 && 곱<=9) {
			System.out.println("한 자리 수입니다.");
		}else {
			System.out.println("두 자리 수입니다.");
		}
		
		
	} else {
		System.out.println("입력 한 수 중에서 1~9가 아닌 수가 있습니다.");
	}
	}

}