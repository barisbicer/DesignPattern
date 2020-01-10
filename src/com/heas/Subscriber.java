package com.heas;

public class Subscriber implements Observer {

	private String name;
	private Channel channel =new Channel();
	
	
	@Override
	public void update()
	{
		
		System.out.println("Hey!.."+this.name+" Video Uploaded "+ channel.title);
		
	}
	
	@Override
	public void subscribeChannel(Channel ch) 
	{
		
		channel = ch;
		
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	
}
