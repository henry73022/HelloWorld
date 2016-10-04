package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class Test {

	public static void main(String[] args) {
		//�ǲΰ��k
//		UserService user = new UserService();
//		user.setName("����");
//		user.sayHello();
		
		//Spring�@�k
//		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext act = new ClassPathXmlApplicationContext("com/service/beans.xml");
//		ApplicationContext�|�N�Ҧ��bxml���t�m��beans�����
		UserService user2 = (UserService)act.getBean("helloBean");
		user2.sayHello();
		
	}

}
