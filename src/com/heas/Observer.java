package com.heas;

public interface Observer {

	void update();

	void subscribeChannel(Channel ch);

}