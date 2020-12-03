package com.javaex.ex02;

public abstract class Bird {
	// 필드
	private String name;

	// 생성자 생략

	// 메소드 겟셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메소드 일반 --> 공통메소드 추가
	public abstract void sing();

	public abstract void fly();

	public abstract void showName();

}
