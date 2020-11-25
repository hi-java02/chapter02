package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		//Point() 생성자 이용, setter사용, getter로 출력
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(10);
		int p1X = p1.getX();
		int p1Y = p1.getY();
		
		System.out.println("x=" + p1X + " y=" + p1Y );
		
		
		//Point(int x, int y) 생성자 이용, setter사용 X, draw()로 출력
		Point p2 = new Point(2, 20);
		p2.draw();
		
		
		//Point(int x, int y) 생성자 이용, setter사용 X, draw()로 출력, setter로 Y값 변경, 다시 draw()로 확인
		Point p3 = new Point(100, 200);
		p3.draw();
		
		p3.setY(500);
		p3.draw();
						
	}

}
