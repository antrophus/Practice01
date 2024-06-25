package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		/*사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요
		 * 
		 * 구의 부피를 구하는 공식
		 * 
		 * V = 4/3*pi*r*r*r
		 */
		
		final double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		
		System.out.println("구의 부피는: " + (double)4/3*pi*r*r*r);
		
		System.out.println("-----------------------------------");
		
		System.out.print("반지름: ");
		
		double r2 = sc.nextDouble();
		
		System.out.println("구의 부피는: " + (double)4/3*pi*r2*r2*r2);
		
		sc.close();
		
		

	}

}
