package com.kh;

  import java.util.Scanner;
  

public class B_Comparison {


	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 두 정수의 값을 비교
		// -> Scanner
		
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		
		
		System.out.println("정수1과 정수2는 같은 값인가 ?" + (n1 == n2));
		System.out.println("정수1이 정수2보다 큰가 ?" + (n1 > n2) );
		System.out.println("정수2는 짝수인가 ?" + ((n2 % 2) == 0));
		// 
		System.out.println("정수2는 'A'의 유니코드(아스키코드)인가? " 
				+ (n2 == 'A'));
		
		
	}
}
