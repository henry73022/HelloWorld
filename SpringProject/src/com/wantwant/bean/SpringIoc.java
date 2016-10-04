package com.wantwant.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HelloBean x = (HelloBean)ctx.getBean("helloBean");
		System.out.println(x.getName());

	}

}
