package com.javaex.ex02;

public class Duck extends Bird {

	//필드
	protected String name;
	
	//생성자 생략
	
	//메소드 겟셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//메소드 일반
    public void sing() {
    	System.out.println("오리"+"("+this.name+")"+"가 소리내어 웁니다.");
    }

	public void fly() {
		System.out.println("오리"+"("+this.name+")"+"가 날지 않습니다.");
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 "+this.name+" 입니다.");
    }
    
    /*
     * bird01.setName("꽥꽥이");
        bird01.fly();
        bird01.sing();
        bird01.showName();
        */

}
