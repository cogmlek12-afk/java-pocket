package com.kh;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 기본적으로 프로그램은 순차적으로 실행 (위->아래,좌->우)
	 * 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리가능
	 * 
	 * -조건문 if 
	 * [1] 단독if문
	 * 
	 *       if (조건식) {
	 *       //조건식의 결과가 true일 때 실행할 내용
	 *       }
	 * [2] if ~ else 문
	 *        if (조건식) {
	 *       //조건식의 결과가 true일 때 실행할 내용
	 *       } else {
	 *       //조건식의 결과가 false일 때 실행할 내용
	 *       }
	 *       
	 * [3] if ~ else if ~ else 문
	 *        if (조건식1) {
	 *        //조건식1의 결과가 true일 때 실행
	 *        } else if (조건식2) {
	 *        //조건식1의 결과가 false 이고, 조건식2의 결과가 true 일 때 실행
	 *        } else {
	 *        //조건식1, 조건식2의 결과가 모두 false일 때 실행
	 *        
	 *        
	 *       
	 */

	public static void main(String[] args) {
		//method1();
		method2();
		

	}
	
	public static void method1( ) {
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 값이 1~10 사이의 값이면 해당 값을 출려
		// 그렇지 않으면 " 범위를 벗어났습니다 " 출력
	
		System.out.print("1~10 사이의 값 입력: ");
		int dd = sc.nextInt();
		
		if(dd >= 1 && dd <= 10){
			
			System.out.println(dd);
		} else {
			System.out.println(" 범위를 벗어났습니다 ");
			
			
		}
		
		sc.close();
		
	}
	
	public static void method2( ) {
		/*
		 * 주민번호를 입력 받아 성별을 출력 ("남자","여자")
		 * -포함하여 카운트
		 * 14자리아닐시에도 잘못입력했습니다 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("주민번호 입력 (-포함) : ");
	    String ssn = sc.nextLine(); 
		
	    if (ssn.length() == 14) {
	    char gender = ssn.charAt(7);
	    
	    if (gender == '1' || gender == '3') {
	    	System.out.println("남자");
	    } else if (gender == '2' || gender == '4') {
	    	System.out.println("여자");
	    } else {
	    	System.out.println("외국인");
	    }
	    
	    } else {
	    	System.out.println("잘못 입력했습니다.");
	    	
	    	
	    }
	    
	   
	    sc.close();
	    
	    
		
		
	}

}





























