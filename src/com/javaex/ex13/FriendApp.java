package com.javaex.ex13;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
	
		Friend[] friendArray = new Friend[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("친구3명을 등록해 주세요");
	
		
		for(int i=0; i<friendArray.length; i++) {
		
			//이름
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			//전화번호
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			
			//학교
			System.out.print("학교: ");
			String school = sc.nextLine();
			
			Friend fr = new Friend();
			fr.setName(name);
			fr.setHp(hp);
			fr.setSchool(school);
			
			friendArray[i] = fr;

		}
		
		for(int i=0; i<friendArray.length; i++) {
			//System.out.println(friendArray[0].toString());
			friendArray[i].showInfo();
		}
				
		
		
		
		
		
		
		sc.close();
		
		
	}

}
