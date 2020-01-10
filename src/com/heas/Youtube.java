
package com.heas;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channel heas=new Channel();
		Channel heas1=new Channel();
		
		Subscriber s1=new Subscriber("baris");
		Subscriber s2=new Subscriber("defne");
		Subscriber s3=new Subscriber("omer");
		Subscriber s4=new Subscriber("duygu");
		Subscriber s5=new Subscriber("tuna");
		Subscriber s6=new Subscriber("hilal");
		
		heas.subscribe(s1);
		heas.subscribe(s2);
		heas1.subscribe(s3);
		heas.subscribe(s4);
		heas1.subscribe(s5);
		heas.subscribe(s6);
		
		s1.subscribeChannel(heas);
		s2.subscribeChannel(heas);
		s3.subscribeChannel(heas1);
		s4.subscribeChannel(heas);
		s5.subscribeChannel(heas1);
		s6.subscribeChannel(heas);
		
		heas.upload("How to learn programin!!");
		heas1.upload("Türkiye Cumhuriyeti");

	}

}
