package com.javaex.ex12;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자 *디폴드 생성자는 삭제됨
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반메소드
	public void showInfo() {
		System.out.println("상품명: " + name + ",  가격:" + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
