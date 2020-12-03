package com.javaex.ex21;

import com.javaex.ex20.Shape;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s
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

	// 메소드 - 일반
	public void draw() {
		System.out
				.println("삼각형-면색:" + super.fillColor + "  선색:" + super.lineColor + "  가로:" + width + "  세로:" + height);
	}

	public double area() {
		// double area = width * height / 2;
		return width * height / 2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

}
