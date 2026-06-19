package com.kh.ex2.run;

import com.kh.ex2.model.vo.Book;

public class Run { 
	
 public static void main(String[] args) {
	 
	 Book b1 = new Book();
	 
	 b1.setTitle("객체지향의 사실과 오해");
	 b1.setAuthor("조영호");
	 b1.setPublisher("위키북스");
	 b1.setPrice(25000);
	 b1.setDiscountRate(0.1);
	 
	 Book b2 = new Book ("클린코드", "인사이트", "로버트C.마틴");
	 b2.setPrice(38000);
	 b2.setDiscountRate(0.15);
	 
	 
	 
	 
	 
	 Book b3 = new Book("실용주의", "인사이트", "앵드류 헌트,데이비드 토마스", 35000, 0.15);
	 
	 b1.inform();
	 b2.inform();
	 b3.inform();
	 
 }
}
