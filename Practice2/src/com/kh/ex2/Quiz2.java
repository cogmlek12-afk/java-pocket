package com.kh.ex2;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * 교환 전: a = 10, b = 20
           교환 후: a = 20, b = 10
		 * 
		 */
		
		
		int a = 10;
		int b = 20;
		
		System.out.printf("교환전: a = %d, b = %d\n", a,b);
		
		int x = a;
		
		a = b;
		b = x;
		
		System.out.printf("교환전: a = %d, b = %d\n", a,b);
		
		
	}

}
