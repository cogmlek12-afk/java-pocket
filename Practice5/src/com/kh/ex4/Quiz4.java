package com.kh.ex4;

import java.util.Scanner;

public class Quiz4 {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수입력 : ");
	int num = sc.nextInt();
	
	for(int i= 1; i <= num; i++) { //행(줄)마다 "*"을 출력하기 위해 반복시킴
		
		//"*"을 행의 개수만큼 출력
		// 1 : *
		// 2: **
		// 3: ***
		
		for(int j = 1; j <= i; j++) {
			  System.out.print("*");
		}
		
		System.out.println();
		
	}
	
	
	
	
}


}