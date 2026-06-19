package com.kh.ex2;


   import java.util.Scanner;
   
public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 값이 1이상이 될 때까지 반복문 실행! (횟수가 정해져있지 않으므로 while 사용!)
		
	   int num = 0;
	   
	   while(num < 1) {
		   System.out.print("1 이상의 숫자를 입력하세요 : ");
		    num = sc.nextInt();
		   
		    if (num < 1) {
		    	System.out.println("1이상의 숫자를 입력해주세요.");
		    	
		    	
		    }
		   
	   }
	   
	   //입력받은 값이 1이상인 경우 아래 내용실해
	   for (int i = num; i > 0; i--) {
		   System.out.print(i + "");
		   
		   
	   }
	   
	   sc.close();
	   
	}

}
