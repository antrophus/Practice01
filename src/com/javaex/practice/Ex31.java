package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		/*상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		
		double price = sc.nextDouble();
		
		System.out.print("받은 돈: ");
		double income = sc.nextDouble();
		
		System.out.println("=======================================");
		
		System.out.println("받은돈: " + income );
		System.out.println("상품가격: " + price );
		System.out.println("부가세: " + price*0.1);
		System.out.println("잔액: " + (income -price - price*0.1));
		
		sc.close();
		

	}

}
