package com.javaex.ex23;

public class Ex24 {

	public static void main(String[] args) {
		
		//정상적인 경우
		Ractangle r = new Ractangle(5, 5);
		r.showInfo();
		
		
		//NullPointerException
		try {
			Ractangle r01 = null;
			r01.showInfo();
		}catch (NullPointerException e) {
			System.out.println("널포인트 발생 --> 처리로직");
		}
		
		
		//ArrayIndexOutOfBoundsException
		try {
			int[] intArray = new int[] {3,6,9};
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위밖--> 처리로직");
			System.out.println(e.toString());
		}
		
		
		

	}

}
