//프로젝트명 : 자바테스트 _ 정리하기
package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		키보드로 1개의 정수형(int) 데이터를 입력받아,
		1~100 사이의 값일때만 2의배수인지 아닌지를 출력 처리한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		
		int 숫자 = sc.nextInt();
			if(숫자>=1 && 숫자<=100) {
				if((숫자%2==0)) {
					System.out.println("2의 배수가 맞습니다.");
				}else {
					System.out.println("2의 배수가 아닙니다.");
				
			}
			}else {
				System.out.println("1~100사이 숫자만 입력해주세요.");
			}
		}
	
	}

