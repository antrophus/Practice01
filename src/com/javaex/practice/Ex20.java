package com.javaex.practice;

public class Ex20 {
	
	public static void main(String[] args) {
		
		/*아래의 출력 결과를 예상하여 작성하세요
		(코드를 작성해서 예쌍과 맞는지 확인해 보세요)
		
		*
		*int i = 10;
		*int n = i++ %2;
		*
		* System.out.println(i); --> 10
		* System.out.println(n); --> 0
		* 
		*/
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i); //11
		System.out.println(n); //0
		
	}

}
