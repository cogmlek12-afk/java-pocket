package com.kh.method;

import java.util.Scanner;

public class Method1 {
/*
 *  메소드 : 함수. 클래스 내에서 특정 기능을 묶어놓은 부분.
 *  
 *  *표현법*
 *  -접근제한자 예약어 반환형 메소드명([매개변수]) { 
 *   //실행할 내용
 *  }
 */
	
	
	public static void main(String[] args) {
		hE();
		hi("누룽지");
		hi("감자");
		hi("고구마");
		hi("계란말이");
		hi("회전초밥");
	
		int random1 = getRandom();
		System.out.println("랜덤값 : " + random1);
		
		
		
		int random2 = getRandom(1000);
		System.out.println("랜덤값 : + random2");
		
		
		
		
	}

	/** 
	 * 메소드 실행시 "Hi Everyone !" 을 콘솔창에 출력
	 * ㄴ값이 아니고 그냥 동작한거임
	 * main 메소드에서 호출할 예정!
	 * 
	 */
	
	public static void hE() {
		
		System.out.println("Hi Everyone!");
		
		
	}
	
	/**
	 * 메소드 실행 시 이름(name)을 전달받아
	 * "안녕하세요 {name}님" 콘솔창에 출력
	 */
	public static void hi(String name) {
		
		System.out.println("안녕하세요 " + name + "님!!!!!!!!!!!!!");
		
	}
	
	/**
	 * 메소드 실행 시 1 ~ 100사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom() {
		
		
		int random = (int)(Math.random() * 100 + 1);
		
		return random;
		
		
	
	}
	
	/**
	 * 메소드 실행시 1부터 전달받은값 (end)사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	
	
	public static int getRandom(int end) {
		int random = (int)(Math.random() * end + 1);
		

		return random;
		
	}
	

}
