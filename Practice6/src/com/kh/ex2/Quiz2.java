package com.kh.ex2;
import java.util.Scanner;
/*
 * - **배열에 있는 과일을 입력한 경우**

		```
		찾을 과일 이름을 입력하세요 : 바나나
		바나나는 배열의 2번 인덱스에 있습니다.
		```
  					
 		- **배열에 없는 과일을 입력한 경우**

		```
		찾을 과일 이름을 입력하세요 : 수박
		찾는 과일이 없습니다.
		```
 					
 */
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub

		String[] fruits = {"사과", "딸기", "바나나", "키위", "복숭아"};
		
		System.out.print("찾을 과일 이름을 입력하세용 : ");
		String fName = sc.nextLine();
		
		//과일 목록에서 찾을 과일 찾기
		// -> 배열에서 입력받은 값과 일치하는 항목 찾기.
		int fIndex = -1; //일치하는 과일을 찾았을 경우 해당 인덱스를 저장
		
		for(int i=0; i<fruits.length; i++) {
			
			// fruits[i] => i번째 위치의 값 => 문자열
			boolean isEquals = fruits[i].equals(fName);
			
			
			if(isEquals) {
				fIndex = i;
				break;
				
			}
			
		}
		
		// 찾았을 경우 "{n}번째 인덱스에 있습니다"출력
		// 없을경우 "찾는 건 못드세요 ~ " 출력
		if (fIndex > -1 ) {
			System.out.print(fName + "은 배열의 " + fIndex + " 번 인덱스에 있습니당");
		} else {
			System.out.print("없어용 안팔아요 못드세요");
			
		}
	}

}
