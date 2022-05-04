package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.getClass()); // 클래스 정보
		System.out.println(obj.hashCode()); // 일단 주소라고 알고있자 1365202186
		System.out.println(obj.toString()); // java.lang.Object@515f550a
		System.out.println(obj.equals(obj));
		System.out.println("=======================");
		
		System.out.println("Obj.getClass()=========");
		System.out.println(obj.getClass());
		
		System.out.println("Obj.hasCode()============");
		
		
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println("=======================");
		

		System.out.println("Obj.toString()============");
		System.out.println(obj.toString());
		//객체의 값 정보를 문자열로 보여줌

		System.out.println("Obj.equals()============");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj2));
		
		
		
		
		
		
		
	}

}
