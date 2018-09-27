package com.HelloWorld.Annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.HelloWorld.decoupled.MessageProvider;
import com.HelloWorld.decoupled.MessageRenderer;

public class HelloWorldSpringAnnotation {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
