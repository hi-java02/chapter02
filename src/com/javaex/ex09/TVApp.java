package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
        TV tv = new TV( 7, 20, false);  
       
        //toString으로 기본 테스트
        System.out.println(tv.toString());  
        System.out.println("=========================");
        
        
        //현재 상태 출력메소드로 생성시 상태값 확인
        tv.status(); 
        System.out.println("=========================");
        
        //전원 테스트 켬
        tv.power(true);
        tv.status(); 
        System.out.println("=========================");

        //전원 테스트 끔
        tv.power(false);
        tv.status();
        System.out.println("=========================");
        
        //볼륨 테스트 (볼륨 직접 입력)
        tv.power(true);   //전원 false로 변경하고 테스트 해볼것
        tv.volume(98);    //볼륨 숫자 변경해서 테스트 해볼것
        tv.status();
        System.out.println("=========================");
        
       
        //볼륨 테스트 (볼륨 업 다운 버튼 으로 입력)
        tv.power(true);  //전원 false로 변경하고 테스트 해볼것
        tv.volume(97);
        tv.status();
        
        tv.volume(true); 
        tv.volume(true);
        tv.status(); //정상범위
        
        tv.volume(true);
        tv.volume(true);
        tv.status(); //비정상 범위
        
        tv.volume(2);
        tv.status();
        
        tv.volume(false);
        tv.volume(false);
        tv.volume(false);
        tv.status(); //비정상 범위
        
        System.out.println("=========================");
        
        //채널 테스트 (채널 직접 입력)
        tv.power(true); //전원 false로 변경하고 테스트 해볼것
        tv.channel(11);    //채널 숫자 변경해서 테스트 해볼것
        tv.status();
        System.out.println("=========================");
        
        //채널 테스트 (채널 업 다운 버튼 으로 입력)
        tv.power(true);  //전원 false로 변경하고 테스트 해볼것
        tv.channel(253);
        tv.status();
        
        tv.channel(true); 
        tv.status(); //정상범위
        
        tv.channel(255);
        tv.channel(true);
        tv.status(); //비정상 범위
        
        tv.channel(2);
        tv.status();
        
        tv.channel(false);
        tv.channel(false);
        tv.channel(false);
        tv.status(); //비정상 범위
        
        System.out.println("=========================");
        
        tv.channel(9);
        tv.volume(15);
        tv.status();
        
  
        
	}

}
