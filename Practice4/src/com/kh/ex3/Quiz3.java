package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.print("점수를 입력하세요(0-100):");
		  
		 int num = sc.nextInt ();
		 
		 if ( num >= 0 && num<= 100 ) {
			 
		 if (num >= 90) {
				 System.out.println("A");
	    } else if (num >= 80) {
				 System.out.println("B");
	    } else if (num >= 70) {
				 System.out.println("C");		
	    } else {
				 System.out.println("F");	
			 }
		 
		 } else {
		 System.out.println("점수를 올바르게 입력해주세요");
		 
	}

}

}  
		/*
		 * 
		 *   switch (num) { 
		 *
		case 1 :
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4:
			System.out.println("F");
			break; 
			
			
		default : 
			System.out.println("점수를 올바르게 입력해주세요.");
			break;
			
		 */
	
