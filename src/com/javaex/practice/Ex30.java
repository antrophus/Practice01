package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		/*마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)*/
		
		final double mile = 1.609;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		
		double m = sc.nextDouble();
		
		System.out.println(m + "마일은 " + m*mile + "킬로미터 입니다.");
		
		
		System.out.print("마일을 입력하세요: ");
		
		double m2 = sc.nextDouble();
		
		System.out.println(m2 + "마일은 " + m2*mile + "킬로미터 입니다.");
		
		
		
		sc.close();
		
		

	}

}
