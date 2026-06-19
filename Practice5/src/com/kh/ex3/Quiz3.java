package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("첫번째 숫자 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int n2 = sc.nextInt();

		
		if (n1 >= 1 && n2 >= 1) {
			
			int max = (n1 > n2) ? n1 : n2; //큰값
			int min = (n1 < n2) ? n1 : n2; //작은값
			
			// 초기식 : int i = min;
			// 증감식 : i++; 
			// 조건식 : i <= max;
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + "  ");
			}
		} else {
			
			System.out.print("1이상의 숫자를 입력해주세요");
			
			
		}
	}

}
