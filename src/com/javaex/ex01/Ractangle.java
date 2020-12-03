package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	//ShapeApp에서 가로 길이를 출력하기 위해 메소드 getter/setter 추가
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//Shape에 draw 추상메소드가 있기 때문에 자식도 draw메소드를 갖고 있어야 됨.
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		

}


