package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		
		/*다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
		 * 결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		 * 
		 * double f=80.0;
		 * 
		 * System.out.println(5/9*(f-32.0)); --> 연산 우선순에 따라 5/9가 먼저 연산되어 int형 값으로 소수점 이하 버림으로 0 출력.  
		 */
		
		double f=80.0;
		
		System.out.println(5.0/9*(f-32.0));
		

	}

}