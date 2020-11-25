package com.javaex.ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	//생성자
	//메소드 유사, 생성자 이름은 클래스명과 동일, 리턴형이 없다
	public Song() {
		//메모리에 올린다.
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//메모리에 올린다.
		//추가작업 -->초기값 대입
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
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
		System.out.println(artist + ", " + title + " (" + album + ", " + year + ", " + track + "번track, " + composer + "작곡 )" );
	}
	
}
