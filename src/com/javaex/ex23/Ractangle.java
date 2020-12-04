package com.javaex.ex23;

public class Ractangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println("가로:" + width + "    세로:" + height + "    사각형을 그렸습니다.");
	}
	
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}

	
	
}
