package com.javaex.ex24;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		
		
		//상황1 - 정상적인 경우(사용하는 입장)
		MyFile mf = new MyFile(); 
		String str = mf.fileRead("c:/javaStudy/test.txt");
		System.out.println(str);
		
				
		//상황2 - 예외가 발생하는 경우(사용하는 입장) - 예외처리된 메소드 사용
		MyFile mf2 = new MyFile();
		String str2 = mf.fileRead2("c:/javaStudy/test.txt");
		
		
		//상황3 - 상황2에서 자신만의 예외처리를 해야하는 상황
		//        만든쪽에서 어떤 예외상황이 발생하는지 알려주고 반드시 처리하게 한다.
		MyFile mf3 = new MyFile();
		try {
			String str3 = mf.fileRead3("c:/javaStudy/test.txt");
		}catch (IOException e) {
			System.out.println("파일을 강제로 만들어서 오류없이 처리");
		}
		
	}

}
