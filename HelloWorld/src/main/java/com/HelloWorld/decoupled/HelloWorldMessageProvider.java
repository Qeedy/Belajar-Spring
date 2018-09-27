package com.HelloWorld.decoupled;

public class HelloWorldMessageProvider implements MessageProvider {

	private MessageProvider messageProvider;
	
	@Override
	public String getMessage() {
		return "Hello World!";
	}
	
}
