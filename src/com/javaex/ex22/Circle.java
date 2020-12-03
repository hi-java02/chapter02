package com.javaex.ex22;

public class Circle extends Shape implements Drawable{

	//필드
	private int radius;

	//생성자
	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	//메소드 g/s
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드 일반
	public void draw() {
		System.out.println("원-면색:" + super.fillColor + "  선색:"+ super.lineColor + 
				           "  반지름:" + radius );
	}

	public double area() {
		return 3.14 * radius * radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
	
}
