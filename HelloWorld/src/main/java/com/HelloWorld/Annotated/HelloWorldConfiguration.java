package com.HelloWorld.Annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.HelloWorld.decoupled.HelloWorldMessageProvider;
import com.HelloWorld.decoupled.MessageProvider;
import com.HelloWorld.decoupled.MessageRenderer;
import com.HelloWorld.decoupled.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
	//equivalent <bean id="provider" class="..."/> see at Classpath:/spring/app-context.xml
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}
	//equivalent <bean id="renderer" class="..."/>see at Classpath:/spring/app-context.xml
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
