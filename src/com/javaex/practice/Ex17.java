package com.javaex.practice;

public class Ex17 {
	
	public static void main(String[] args) {
		
		/*다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요
		 (코드를 작성해서 오류가 없도록 변경해 보세요)
		 
		 * public static void main(String[] args){
		 * 
		 * 		int x, y                          --> ;(세미콜론) 미입력
		 * 
		 * 		x = 10                            --> 상동
		 * 		y = 20                            --> 상동 
		 * 
		 * 		sum = x + y                       --> ;(세미콜론) 미입력, 변수 선언시 타입 미입력
		 * 
		 * 		System.out.println("합은' + sum);  -->"(쌍따옴표)로 감싸야 함
		 * 
		 * }
		 */
		
		 int x, y;
		 
		 x = 10;
		 y = 20;
		 
		 int sum = x + y;
		 
		 System.out.println("합은" + sum);
	}

}
