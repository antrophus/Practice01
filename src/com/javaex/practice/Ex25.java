package com.javaex.practice;

public class Ex25 {
	
	public static void main(String[] args) {
		
		/*아래의 출력결과를 예상하여 작성하세요.
		 * (코드를 작성해서 예상과 맞는지 확인해 보세요.)
		 * 
		 * int a = 13;
		 *  System.out.println( (a>13) && (a>=13) ); ------------------------> f && t = false
			System.out.println( (a>13) || (a>=13) ); ------------------------> f || t = true
			System.out.println( (a/3 == 4 ) && (a%3 == 2) );-----------------> t && f = false
			System.out.println( (a/3 == 4 ) || (a%3 == 2) );-----------------> t || f = true
			System.out.println( (a/3 == 4 ) && (a%3 == 2) || ( a/3 == 4 ));--> t && f || t = f || t = true
		 * 
		 * */
		
		int a = 13;
		
		System.out.println( (a>13) && (a>=13) );
		System.out.println( (a>13) || (a>=13) );  
		System.out.println( (a/3 == 4 ) && (a%3 == 2) );
		System.out.println( (a/3 == 4 ) || (a%3 == 2) );
		System.out.println( (a/3 == 4 ) && (a%3 == 2) || ( a/3 == 4 ));
	}

}
