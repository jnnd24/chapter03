package com.javaex.ex04;

public class RectangleApp {
	
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
		
		
		// 각각의width, height 값이같으면같은것으로정의합니다
		//  a b 는 true 가 나와야 함 
		System.out.println("==equals()값비교");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		
			
			
		
		
	}

}
