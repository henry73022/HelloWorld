package com.newhsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/newhsp/beans.xml");
//		UpperLetter changeLetter = (UpperLetter) ac.getBean("changeLette");
//		System.out.println(changeLetter.change());
		
		ChangeLetter changeLetter = (ChangeLetter)ac.getBean("changeLette");
		System.out.println(changeLetter.change());
	}

}
