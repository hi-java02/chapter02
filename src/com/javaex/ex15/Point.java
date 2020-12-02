package com.javaex.ex15;

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

		//메소드- g/s
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

		//메소드- 일반
		public void draw() {
			//복잡한 로직 - 그래프에 점을 나타낸다고 가정
			System.out.println("점[X=" + x + "  Y=" + y + "]을 그렸습니다.");
		}
		
		
		@Override
		public String toString() {
			return "ColorPoint [x=" + x + ", y=" + y + "]";
		}
		
}
