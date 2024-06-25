package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		/*사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		double width = sc.nextInt();
		
		System.out.print("세로: ");
		double height = sc.nextInt();
		
		System.out.println("삼각형의 넓이는 " + width*height/2);
		
		System.out.println("--------------------------------------");
		
		System.out.print("가로: ");
		double width2 = sc.nextDouble();
		
		System.out.print("세로: ");
		double height2 = sc.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + width2*height2/2);
		
		System.out.println("--------------------------------------");
		
		System.out.print("가로: ");
		double width3 = sc.nextDouble();
		
		System.out.print("세로: ");
		double height3 = sc.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + width3*height3/2);
		
		sc.close();
		
		
		
		

	}

}
