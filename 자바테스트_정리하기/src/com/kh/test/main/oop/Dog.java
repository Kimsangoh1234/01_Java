package com.kh.test.main.oop;
//동물 하나만 상속 implements Animal 동물 이외에 여러파일을, 사용해서 작성할 수 있음
//동물에서 소리를 만드는 makesound가 재사용되고 있지 않기 때문에
//강아지에서는 빨간불이 들어옴
public class Dog implements Animal,AnimalEat{
//Animal에 있는 인터페이스 메서드 구현
	
			// 재사용으 어지간해서 작성해주는 것이 좋음
	
	public void makeSound1() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
		
	}
	
	@Override
	public void eat() {
		System.out.println("냠냠!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
}