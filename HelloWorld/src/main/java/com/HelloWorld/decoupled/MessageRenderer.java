package com.HelloWorld.decoupled;

public interface MessageRenderer {

	void render();
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
	
}
