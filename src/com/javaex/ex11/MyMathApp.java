package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		//메모리 스토리
		
		int sum = MyMath.plus(3,  5);
		System.out.println(sum);
		
		double sum01 = MyMath.plus(3.3, 3.4);
		System.out.println(sum01);
		
		
		int sum02 = minus(100, 10);
		
		
	}
	
	//메소드
	//static 지우고 확인해 볼것
	public static int minus(int a, int b) {
		return a-b;
	}
	

}
