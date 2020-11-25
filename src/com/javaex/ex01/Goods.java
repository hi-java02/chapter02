package com.javaex.ex01;

//메모리에서 사용할 *틀
public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//메모리에 올린다.
	}
	
	public Goods(String name, int price) {
		//메모리에 올린다.
		//초기값을 대입한다.
		this.name = name;
		this.price = price;
	}
	
	//메소드 - getter / setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	//메소드 - 일반 메소드
	public void showInfo() {
		System.out.println("상품명: " + name + ",  가격:" + price );
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
