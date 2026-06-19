package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//출력 -> System.out.printxxx
		System.out.print("이름을 입력하세요: ");
		// 입력받기 -> Scanner
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		//String age = sc.nextLine();
		
		
		int age = sc.nextInt();
		
		
		
		System.out.printf("%s님(%d세)의 자바 학습을 환영합니다!", name, age);
		
		
sc.close();




	}

	
}
