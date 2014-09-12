package com.habuma.spitter.service.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiMain {
	public static void main(String[] args) {
		System.out.println("444444444");
		ApplicationContext context = new ClassPathXmlApplicationContext("remote-service-context-2.xml");
	}
}
