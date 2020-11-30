package com.javaex.ex14;

public class Person {
	
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	//메소드-g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    //메소드-일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
