package com.javaex.ex22;

public abstract class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;
		
	//생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드 일반
	//draw()는 만들수 없음 --> 오버라이딩 이용
	//public abstract void draw();  //Drawable 개념을 이동
	
	public abstract double area();
	
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
}
