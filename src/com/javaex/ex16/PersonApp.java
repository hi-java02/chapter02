package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		/* 오버라이딩 테스트
		//test-->섞어쓰기
		//자료형을 통일할려고, 학교정보 유지하고 싶다
		Person s01 = new Student("유재석", 44, "서울고등학교");
	    
		//자식쪽 Student의 정보를 사용할 수 없다.
		//s01.getSchollName(); 사용할 수 없다.
		
		s01.showInfo(); //자식쪽의 showInfo()가 실행된다. 덮어쓴다. 오버라이딩  
		//무모쪽의 showInfo()를 사용할거 라고 생각된다. X
	    System.out.println(s01.toString()); //student의 toString()의 동작한다.
	    
	    */
		
		Person[] psArray= new Person[5];
		
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		Person s01 = new Student("유재석", 44, "서울고등학교");
		Person s02 = new Student("강호동", 47, "경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("=======================================");
		
		System.out.println(((Student)psArray[3]).getSchoolName());
		((Student)psArray[4]).setSchoolName("마산고등학교");
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		
		//케스팅 테스트
		Person t01 = psArray[4];
		// Student t02 = psArray[4];   //오류 양쪽의 자료형이 다름
		Student t03 = (Student)psArray[4];
		Person t04 = (Student)psArray[4]; //자동으로 업케스팅 된다
	}

}
