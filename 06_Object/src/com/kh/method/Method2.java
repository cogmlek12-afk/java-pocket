package com.kh.method;

public class Method2 {
	/*
	 * 메소드 오버로딩
	 * 하나의 클래스내에 같은이름의 여러개의 메소드가 존재할 수 있는 특징
	 * 조건) 매개변수의 개수, 타입, 순서가 달라야함 !
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int result1 = add(20, 7);
		 System.out.println("20+7=" + result1);
		 
		
		 double result2 = add(15.5, 8.8);
		 System.out.println("15.5 + 8.8=" + result2);
	}
	
	/**
	 * add 메소드
	 * : 두 정수의 합을 반환하는 메소드 
	 * 
	 * 전달 받아야 하는 값 => 2개 전달받아야됨
	 * 결과값 => 1개 
	 */

	public static int add(int n1, int n2) {
		
		return n1 + n2;
		
	}
	
	//public static double add(int n1, int n2) 
	
	//오버로디이잉이 적용되지않은 이유 : 같은내용이랴서 / 매개변수 정보(개수,타입,위치)가 동일해서용
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	
	
	public static double add(double n1, double n2) {
		
		return n1 + n2;
		
		
	}
}
