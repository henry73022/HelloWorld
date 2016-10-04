package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class Test {

	public static void main(String[] args) {
		//傳統做法
//		UserService user = new UserService();
//		user.setName("測試");
//		user.sayHello();
		
		//Spring作法
//		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext act = new ClassPathXmlApplicationContext("com/service/beans.xml");
//		ApplicationContext會將所有在xml中配置的beans實體化
		UserService user2 = (UserService)act.getBean("helloBean");
		user2.sayHello();
		
	}

}
