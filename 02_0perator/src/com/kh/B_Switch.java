package com.kh;

import java.util.Scanner;


public class B_Switch {

/*
 * 조건문 switch
 * : 동등 비교를 통해 흐름을 제어
 * 
 * [표현법]
 *         switch(비교대상/보통변수가들어감) {
 *              case 값1 
 *               // 비교대상 == 값1 일 때 실행할 내용
 *               break; 
 *              case 값2:
 *               // 비교대상 == 값2 일 때 실행할 내용
 *               break;
 *               .
 *               .
 *               .
 *               default; -> 모든 case에 해당하지 않을 때 실행할 내용
 *               break;
 *               
 *               
 *         }
 */
	
	public static void main(String[] args) {
		//method1();
		 method2();
		 
		 
		// TODO Auto-generated method stub	
		
	
	}
       public static void method1() {
    	   /* 정수를 입력 받아 아래 조건에 맞게 출력
    	    * 
    	    * 1:빨간색
    	    * 2:노란색
    	    * 3:검은색
    	    * 그 외 : 검은색
    	    */
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.print("1 ~ 3 사이의 정수 입력 : ");
    	   
    	   int num = sc.nextInt();
    	   
    	   switch (num) {
    	   case 1: 
    		   System.out.print("빨간색");
    		   break;
    	   case 2: 
    		   System.out.print("노란색");
    		   break;
    	   case 3: 
    		   System.out.print("초록색");
    		   break;   
    	   default : 
    		   System.out.print("검은색");
    		   break;   
    		   
    	   }
       }
    	   
    	   
    	   public static void method2() {
    		   
    		   /*
    			 * 사용자에게 두 개의 정수와 + 또는 - 를 입력받아 연산 결과를 출력
    			 * 단, + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
    			 * 
    			 * 
    			 * 입력 예시) 10 20 + 
    			 * 출력 예시) 10 + 20 = 30 
    			 * 
    			 * 입력 예시) 5 10 /
    			 * 출력 예시) 5 /10 = 입력이 잘못되었습니다.
    			 * 
    			 *
    			 */
    			Scanner sc = new Scanner(System.in);
    			
    			System.out.println ("다음과 같이 입력 시 연산 결과 확인가능");
    			System.out.println ("ex) 10 20 + => 10+20=30 의 결과 확인");
    			System.out.print(" : ");
    			//버퍼 :  
    			
    			//String result = (ch == '+' && ch =='-') ? "입력이 잘못되었습니다." : 
    			
    			int n1 = sc.nextInt(); //버퍼 : 10 20 +/n, n1 = 10
    			//버퍼 : 20 +\n
    			int n2 = sc.nextInt(); //버퍼 : 20 +/n, n2 = 20
    			//버퍼 : +\n
    			String str0p = sc.next(); //버퍼 : +/n, str0p = +
    			
    			char op = str0p.charAt(0);
    			
    			
    		switch (op) { 
    		case '+':
    			System.out.println("n1 + n2 = " + (n1 + n2));
    			break;
    		case '-':
    			System.out.println("n1 - n2 = " + (n1 - n2));
    			break;
    		case '/':
    			System.out.println("n1 / n2 = " + (n1 / n2));
    			break;
    		case '*':
    			System.out.println("n1 * n2 = " + (n1 * n2));
    			break;
    			
    		default:
    			System.out.println("입력이 잘못되었습니다.");
    			break;
    			
    			
    		}
    		   
    		   
    		   
    		   
    	   }
    	   
    	   
    	   
       }

