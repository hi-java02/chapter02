package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//카메라
		//Goods() 생성자 이용, setter사용, getter로 출력
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		String cameraName = camera.getName();
		int cameraPrice = camera.getPrice();
		
		System.out.println("상품명 " + cameraName + ",  가격:  " + cameraPrice);
			
		
		//노트북
		//Goods(String name, int price) 생성자 이용, setter사용 X, showInfo()로 출력
		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();
		
		
		//머그컵
		//Goods(String name, int price) 생성자 이용, showInfo()로 출력, sertter로 가격 변경, 다시 showInfo()로 확인
		//가격변경되는거 확인
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		cup.setPrice(2500);
		cup.showInfo();
		
		
		
		
		
		
		
		
	
	}

}
