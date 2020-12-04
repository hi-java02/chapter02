package com.javaex.ex23;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		try { 
			double sum = 100 / num;
			System.out.println(sum);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch (NullPointerException e) {
			System.out.println("널포인트");
		}
		
		sc.close();

	}

}
