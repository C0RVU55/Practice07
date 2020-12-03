package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        //구현 --> soundable에 대입된 클래스(Soundable soundable=new Cat();)에서 sound 메소드 호출 후 출력.
    	System.out.println(soundable.sound());
    }
    
}


