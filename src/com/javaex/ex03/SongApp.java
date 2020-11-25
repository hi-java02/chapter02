package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		//메인스토리
		//Song() 생성자 이용, setter사용, showInfo()로 출력
		Song s01 = new Song();
		
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);

		s01.showInfo();
		
		
		//Song(파라미터...) 생성자 이용, setter사용 X, showInfo()로 출력
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		
		/*
		s02.setTitle("거짓말");
		s02.setArtist("BIGBANG");
		s02.setAlbum("Always");
		s02.setComposer("G-DRAGON");
		s02.setYear("2007");
		s02.setTrack(2);
		*/
		s02.showInfo();
		
		//트랙번호 변경 후 확인
		s02.setTrack(100);
		s02.showInfo();
		
		
	}

}
