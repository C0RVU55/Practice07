package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강"); --> Shape는 추상클래스라 객체화(new) 불가능.
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10); //문제에 맞게 값 수정
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력 --> Ractangle에 메소드 getter 추가하고 sr1 다운캐스팅해서 자식클래스의 메소드 호출.
		System.out.println(((Ractangle)sr1).getWidth());
	}
}

	
	