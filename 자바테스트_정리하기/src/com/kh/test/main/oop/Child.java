package com.kh.test.main.oop;
//자식클래스로 부모클래스를 상속 extends 인터페이스가 아니라 클래스를 상속 받을 때는
//하나밖에 상속을 못받기 때문에 extends를 사용한 후 하나의 클래스만 작성해줘야함
public class Child extends Parent{
//필드
	int 자식변수;
//메서드
	//생성자 기본 ctrl space 이긴 하지만 constructor 표시가 있는지 확인 후 엔터
	public Child() {
		// TODO Auto-generated constructor stub
	}
	//생성자 필수 alt shift s o
				// 부모변수는 Parent에서 가져올 예정
public Child(int 자식변수) {
	super(); //parent의 기본 생성자라는 의미
	//super(); 하나의 자식 생성자에서 super를 두 번 부르는 건 불가능
	this.자식변수 = 자식변수;
}


public Child(int 부모변수,int 자식변수) {
		super(부모변수);
		this.자식변수 = 자식변수;
	}
//만약에 super를 기본생성자와 필수생성자 불러오고 싶다면 

public void 자식메서드() {
	super.부모메서드();
	System.out.println("");
}
	
}
