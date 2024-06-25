package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		/*총금액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전체 금액을 입력해 주세요: ");
		int total = sc.nextInt();
		System.out.println("실제 지불 금액은 " +  (total/1000)*1000 + "입니다.");
		
		sc.close();
		

	}

}
