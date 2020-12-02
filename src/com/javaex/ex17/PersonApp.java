package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		
		//Person 배열관리
		Person[] pArray = new Person[3];
		
		Person p01 = new Person("둘리", 1203);
		//System.out.println(p01.toString());
		
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		
		//p01.showInfo();
		//100명 관리중
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		//////////////////////////////////////////////////////////////
		
		Student[] sArray = new Student[2];
		
		Student s01 = new Student("유재석", 44 , "서울고등학교");
		//System.out.println(s01.toString());
		
		Student s02 = new Student("강호동", 47, "경기고등학교");
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].showInfo();
		}
		
		
		
		
		
		/*
		s01.showInfo(); //부모쪽 showInfo()가 호출됨-->학교정보가 없다.
		s01.showInfo2(); //Student 가 원하는 showInfo()기능
		
		//s01.showInfo() 를 사용 할 수도 있게된다. X
		*/
		
		//Student.showInfo2() --> Student.showInfo() 메소드를 같게 만들어 준다.
		//s01.showInfo(); //부모쪽의 showInfo()를 사용할 수없다.
		//1000명 관리중
		
		
		Student s04 = new Student("이효리", 55, "제주고등학교");
		
		System.out.println("------------------------------");
		Person c01 = s04;  //자동 업케스팅 
		c01.showInfo();    //오버라이딩
		System.out.println("------------------------------");
		
		//c01.getSchoolName() 사용할수 없음
		
	}

}
