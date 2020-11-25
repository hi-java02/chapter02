package com.javaex.ex06;

public class PointApp {

	public  void main(String[] args) {
		
		Point p01 = new Point();
		
		p01.setX(3);
		p01.setY(5);
		
		/*
		String str = p01.toString();
		System.out.println(str);
		*/
		
		//System.out.println(p01.toString());
		p01.draw();
		
		
		Point p02 = new Point(100,100);
		p02.draw();
		
		p02.draw(true);
		p02.draw(false);
	
		
		
		
		
		
		
	}

}
