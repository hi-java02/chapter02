package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		//Point() 생성자
		//setter 사용
		//draw() 점을 그린다.
		Point p01 = new Point();
		p01.setX(1);
		p01.setY(5);
		p01.draw();
		
		
		//Point(int x, int y) 생성자 사용
		//setter 사용X
		//draw() 점을 그린다.
		Point p02 = new Point(10, 20);
		p02.draw();
		
		
		
	    //Point(int x) 생성자 사용
		//setY() 사용
		//draw() 점을 그린다.
		Point p03 = new Point(100);
		p03.setY(200);
		p03.draw();
		
		
		//Point(int y) 생성자 사용
		//setX() 사용
		//draw() 점을 그린다.
		
		
	}

}
