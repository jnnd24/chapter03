package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p00 = new Point (3, 5);
		Point p01 = new Point (3, 5);
		Point p02 = new Point (13, 15);
		Point p03 = p02;
		
		System.out.println(p01.getX());
		
		//클래스 정보 보기
		System.out.println(p01.getClass());
		
		System.out.println("=================");
		
		//인스턴스 (객체) 정보 보기
		System.out.println(p01.toString());
		System.out.println(p02.toString());

		System.out.println("=================");
		
		//메모리 주소에 '대응'하는 고유값 (=/주소)
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());

		System.out.println("=================");

		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		System.out.println(p02.equals(p03));

		System.out.println("=================");
		System.out.println("==와 equals를 비고");
		// ==는 변수의 값,, equals는 인스턴스 기준
		// 기본자료형은 실제 값 같은지?
		// 기본자료형 외에는 다 주소로 되어있음!
		
		System.out.println(p00==p01);
		System.out.println(p02==p03);
		
		
		
		//System.out.println(p00.equals(p01));
		//값이아니라 메모리 기준이기떄문에, 값을 기준으로 판단하고 싶으면 아예 equals를 다시 만든다
		
		
		
	}

}
