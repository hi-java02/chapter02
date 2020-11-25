package com.javaex.ex10;

public class Goods {
	//필드
	private String name;
	private int price;
    private static int totalCount;
	

	//생성자
	public Goods() {
		totalCount = totalCount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount + 1;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount = totalCount + 1;
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
		int defaultPrice = 0;
		
		if(price<0) {
			this.price=defaultPrice;
		}else {
			this.price = price;
		}
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	//메소드 일반
	public void showInfo(){ //복잡한 로직이라고 가정
	    System.out.println("상품명:" + name + ", 가격:" + price );
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

}
