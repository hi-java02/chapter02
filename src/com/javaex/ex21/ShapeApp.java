package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape 배열만들기
		Shape[] sArray = new Shape[2];
		
		//사각형 만들기
		//Ractangle r = new Ractangle("빨강", "빨강", 5, 5);
		Shape r01 = new Ractangle("노랑", "노랑", 100, 100);
		
		//원 만들기
		//Circle c = new Circle("파랑", "파랑", 5);
		Shape c01 = new Circle("초록", "초록", 500);
		
		//삼각형 만들기
		//Triangle t = new Triangle("보라", "보라", 7, 7);
		Triangle t01 = new Triangle("분홍", "분홍", 9, 9);
		
		//배열에 주소값 대입
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		//전부 그리기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		/*
		//문제발생-->추상 클래스(abstract)
		Shape s = new Shape("빨강", "검정");
		s.draw();
		*/
		
		//전부 면적구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		
	}
	
	

}
