package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int 국어 = sc.nextInt();
		System.out.println("영어점수 : ");
		int 영어 = sc.nextInt();
		System.out.println("수학점수 : ");
		int 수학 = sc.nextInt();
		Score 점수 = new Score(국어 ,영어 ,수학);
		
		점수.결과();
	}

}
