package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point (2, 3);
		Point p02 = new Point (2, 3);
		Point p04 = p01;
		
		System.out.println(p01==p02);//단순 주소를 비교
		System.out.println(p01.equals(p02)); // 내가 짠 논리를 이용
		System.out.println(p02.equals(p01));
		
		
		System.out.println(p04==p01);
		System.out.println(p01.equals(p04));
		
		
		
	}

}
