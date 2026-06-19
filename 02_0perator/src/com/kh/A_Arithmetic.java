package com.kh;

public class A_Arithmetic {
	
	/*
	 * 산술연산자 (이항 연산자) => +,-,*,/, %
	 * 
	 * 우선순위 -> *,/,%,+,-
	
	
	 */

	public static void main(String[] args) {
		
		//method1();
		method2();
		
			
		
		// TODO Auto-generated method stub

	}

	public static void method1() {
		// 10, 3 값을 각각 n1, n2 변수에 저장
		
		int n1 = 10;
		int n2 = 3;
		
	
		System.out.println(" n1 + n2 = " + (n1 + n2)); 
		System.out.println(" n1 - n2 = " + (n1 - n2));
		System.out.println(" n1 * n2 = " + (n1 * n2));
		System.out.println(" n1 / n2 = " + (n1 / n2));
		System.out.println(" n1 % n2 = " + (n1 % n2));
		
		
	}
	
	public static void method2() {
		
		
	int a = 5;
	int b = 10;
	
	int c = ++a + b; // c=>16 
	int d = c / a;
	int e = c % a;
	int f = e++;
	int g = --b + d--;
	int h = 2;
	int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
	
	// a = 7
	// b = 9
	// c = 16
	// d = 1
	// e = 5
	// f = 4(대입하고 증가시키는거라서 앞으로 e숫자가 바뀌고 f는그대로임)
	// g = 9 + 2 = 11
	// h = 2
	// i = 15 / (15/4=3) 
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	
	
	}
	
	
	
}
