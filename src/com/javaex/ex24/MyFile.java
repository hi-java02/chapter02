package com.javaex.ex24;

import java.io.IOException;

public class MyFile{

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	
	//상황1
	//텍스트파일을 읽어서 글자를 String 으로 린턴해준다.
	public String fileRead(String path){
		//파일을 읽어서 나온 문자열
		return "학교종이 땡땡땡 어서 모이자";  
	}
	
	
	
	//상황2 만드는 입장에서 IOException 처리까지 완료
	//텍스트파일을 읽어서 글자를 String 으로 린턴해준다.
	public String fileRead2(String path){
		//파일을 찾는 로직 있어야 하지만 강제로 상황을 만들었음 
		try {
			throw new IOException();
		}catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		return "학교종이 땡땡....";
	}
	
	
	//상황2 만드는 입장에서 IOException 처리까지 완료
	//      고객들은 불만... 사용하는 쪽에서 처리하고 싶다
	//                       예외처리방식이 다양하다
	public String fileRead3(String path) throws IOException{
		
		throw new IOException();
		
	}
	
}
