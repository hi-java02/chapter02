package com.javaex.ex07;

public class Song {

	// 필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자 0
	public Song() {
		// 메모리에 올린다.
	}

	// 생성자 2 : 타이틀 트랙번호 --> 확인 : 파라미터의 자료형이 달라서 사용가능
	public Song(String title, int track) {
		// 메모리에 올린다.
		// 추가작업 -->초기값 대입
		this.title = title;
		
		if(track < 5) {//복잡한 로직이 있을 수있다. 가정 100라인
			this.track = 0;
		}else {
			this.track = track;
		}
		
		System.out.println("생성자(2)");
		
	}
	

	// 생성자 6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		// 메모리에 올린다.
		// 추가작업 -->초기값 대입
		this(title, track);  //다른 생성자를 호출한다.(사용한다)
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		
		System.out.println("생성자(6)");

	}

	// 생성자 2 : 타이틀 아티스트
	public Song(String title, String artist) {
		// 메모리에 올린다.
		// 추가작업 -->초기값 대입
		this.title = title;
		this.artist = artist;
	}

	// 생성자 2 : 타이틀 작곡자 --> 확인 :생성자가 중복되서 사용할 수 없다
	/*
	public Song(String title, String composer) { 
	    //메모리에 올린다. //추가작업 -->초기값 대입
	    this.title = title; 
	    this.composer = composer; 
	}
	*/



	// 메소드 - getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + " (" + album + ", " + year + ", " + track + "번track, " + composer + "작곡 )");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	

}
