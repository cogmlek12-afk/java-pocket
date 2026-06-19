package com.kh;

public class B_cast {

	public static void main(String[] args) {
		//aotoCasting();
		
		forceCasting();
		
	}
	public static void forceCasting() {
		
		/*위에 왜 빨간줄임 ???????????????
		 * 
		 * 강제 형변환
		 * :자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 * 
		 * (변환할자료형) 변환할대상
		 * 
		 * 
		 */
		
		
		//실수형 변수 d1에 4.0 이라는 값을 저장
		
		//정수형 변수 i1에 50이라는 값을 저장
		
		// d1에 값과 i1의 값을 더해서 정수형 변수 result에 저장
		
		double d1 = 4.0;
		int i1 = 50;
				
	   // int result = (int)(d1 + i1); 
	   
	   // <-앞에 (int 붙이면) 형변환됨
	   
	   int result = (int)d1 + i1;
	   
	
	
	int i2 = 290;
	byte i3 = (byte)i2;
	
	System.out.println("i13 : " + i3);
	
	
	
	}
	
	
	
    public static void aotoCasting() {
    	/*
    	 * 자동 형변환 (int/4B,double/8B라서 자동으로 변환됨)
    	 * :값의 범위가 좁은(작은) 자료형에서 넓은 (큰) 자료형으로 자동 형변환
    	 */
    	
    	// 정수형 변수 i1에 12라는 값을 저장
    	int i1 = 12;
    	// 실수형 변수 d1에 i1의 값을 저장
    	double d1 = i1;
    	
    	 System.out.println("d1 : " + d1);
    	 
    	 
    	
    }
}
