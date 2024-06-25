package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		/*동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int t500 = sc.nextInt()*500;
		System.out.print("100원의 개수: ");
		int t100 = sc.nextInt()*100;
		System.out.print("50원의 개수: ");
		int t50 = sc.nextInt()*50;
		System.out.print("10원의 개수: ");
		int t10 = sc.nextInt()*10;
		
		System.out.println("동전의 총합은 " + (t500 + t100 + t50 + t10) + " 원 입니다.");
		
		sc.close();

	}

}
