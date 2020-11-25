package com.javaex.ex09;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	
	//기본생성자 필요없음
	//-->아래의 생성자 생기면서 기본생성자 없어짐
	
	//생성자
	public TV(int channel, int volume, boolean power) {
		//case 1 : 볼륨 과 채널 범위 체크없이 진행할때
		this.power = power;
		this.volume = volume;
		this.channel = channel;
		
		//case2 : 볼륨 과 채널 범위 체크하여 진행할때
		/*
		this.power = power;
		channel(channel);
		volume(volume);
		*/
	}
	
	
	//getter     setter는 만들지 않음-->setter로 값 변경X
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	
	//파워관련
	public void power(boolean on) {
		this.power = on;
	}
	
	
	//볼륨관련(0~100)
	public void volume(int volume) {
		if(power == true) { //전원이 켜졌을때만 볼륨값 변경됨
			if(volume < 0) { //0보다 작은 수 입력되면 0으로 처리
				this.volume = 0;
			}else if(volume > 100) { //100보다 큰 수 입력되면 100으로 처리
				this.volume = 100;
			}else {
				this.volume = volume;
			}
		}
	}
	
	public void volume(boolean up) {
		if(up == true) {
			volume(this.volume+1); 
		}else {
			volume(this.volume-1);
		}
	}
	
	//채널관련(1~255)
	public void channel(int channel) {
		if(power == true) { //전원이 켜졌을때만 채널값 변경됨
			if(channel < 1  || channel > 255) { //채널이 1 보다 작거나 100보다 크면 메세지 출력
 				System.out.println("없는 채널입니다.");
			}else {
				this.channel = channel;
			}
		}
	}
	
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		}else {
			channel(this.channel-1);
		}
	}
			
	

	//일반 메소드
	public void status() {
		System.out.println("채널:" + channel+ "    볼륨:" + volume + "    전원:" + power);
	}


	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
	
	
	
	
	
}
