package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a.trim());
		System.out.println("_"+a+"_");
		
		a = a.replace("ab", "123");
		System.out.println(a);
		
		System.out.println("--------------");
		
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);

		System.out.println("--------------");
		
		String str = "Hello JAVA";
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1,3);
		System.out.println(result02);
		
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		
		
		
	}

}

/*
concat()	-더하기
trim()		-공백을 없앰
replace()	-글자 교체
split()		-글자나누기
substring()	-star부터en까지 or start부터
charAt()	-꺼내기
*/