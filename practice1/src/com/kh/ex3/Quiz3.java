package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				

		
      System.out.print("상품명을 입력하세요:");
     String name = sc.nextLine();
      
     
      System.out.print("수량을 입력하세요:");
      int qty = sc.nextInt();
      
      System.out.print("단가를 입력하세요:");
	  double price = sc.nextDouble();
	  
	  
     System.out.println("---장바구니 영수증---");
     System.out.println("상품명    :  " + name);
     System.out.printf("%-7s: : %d잔 \n","수량", qty);
     System.out.printf("%-7s: %.2f원\n" , "단가", price);
     System.out.println("----------------");
     System.out.printf("총 금액   :%.2f 원", qty * price);
     
     
     
    
     
   
	}

}
