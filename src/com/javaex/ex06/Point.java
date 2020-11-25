package com.javaex.ex06;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	// 메소드 일반메소드 : (사용자 화면 점 복잡한 로직으로 이루어짐)
	public void draw() {
		System.out.println("점[X=" + x + "  Y=" + y + "]을 그렸습니다.");
	}

	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("점[X=" + x + "  Y=" + y + "]을 그렸습니다.");
		} else {
			System.out.println("점[X=" + getX() + "  Y=" + getY() + "]을 지웠습니다.");
		}
	}
	

	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
}
