package com.kh;

import java.util.Scanner;

public class C_Logical {

	
	public static void main(String[] args) {
		
		
		// method1();
		method2();
		
		
		}
	
	
	public static void method1() {
		
		// 입력받은 값이 1 ~ 10 사이의 값인지 확인
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("정수를 입력하세요 : ");
		    int num = sc.nextInt();
		  
		    
		    // -> true 또는 false로 결과 출력
		    
		    boolean result = ( num >= 1) && (num <= 10);
		   
		    // 1 <= num 
		    
		  System.out.println("입력된 값은 1 ~ 10 사이의 값인가?" + (result));
		  
		  boolean result2 = num < 1 || num > 10;
		  
		  System.out.println("입력된 값은 1 ~ 10 범위를 벗어나는가?" + (result2));
		  
		 
             }
	
	public static void method2()  {
		
		// 입력받은 문자가 소문자인지 확인
		// 'a' : 97, 'z' : 122
		
		
         Scanner sc = new Scanner(System.in);
         
         System.out.print("문자입력 : ");
         String str = sc.next();
		
         char ch = str.charAt(0);
         
         boolean result = ch >= 97 && ch <= 122;
         boolean result2 = ch >= 'a' && ch<='z';
         
         
         System.out.println("입력 받은 값이 소문자인가?" + result);
         System.out.println("입력 받은 값이 소문자인가?" + result2);
         
         
         
	}
}



