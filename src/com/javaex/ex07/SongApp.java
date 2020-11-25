package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		//테스트
		Song s00 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		System.out.println(s00.toString());
		
        //Song() 생성자 사용
		//setter 6개 사용 값 대입
		//showInfo() 출력
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		//System.out.println(s01.toString());
		s01.showInfo();
		
		System.out.println("=================");
		
		//Song(파라미터 6개) 생성자 사용
		//setter 사용X
		//showInfo() 출력
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		//System.out.println(s02.toString());
		s02.showInfo();
		
		
		System.out.println("=================");
		
		//Song(파라미터 2개) 생성자 사용
		//setter 사용
		//showInfo() 출력
		Song s03 = new Song("벚꽃엔딩", "버스커버스커");
		s03.setAlbum("버스커버스커1집");
		s03.setComposer("장범준");
		s03.setYear("2012");
		s03.setTrack(4);
		//System.out.println(s03.toString());
		s03.showInfo();
				
	}

}
