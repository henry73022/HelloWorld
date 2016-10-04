package com.test.json;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;

public class Jsondemo {

	public static void main(String[] args) {
		
		  //======= Object to JSON =======
		  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		  //�إ�Book����
//		  Book book = new Book("956-987236-1", "Java���I�O", 550);
		  Book book  = (Book) ac.getBean("book");
		  //�إ�GSON����
		  Gson gson = new Gson();
		
		  //�NBook�����নJSON
		  String json = gson.toJson(book);
		  //��JSON�榡����ƨq�X��
		  System.out.println(json);
		  //��X���G�G{"isbn":"956-987236-1","name":"Java���I�O","price":550}
		  //======== JSON to Object ========
		  //�NJSON�榡������ন����
		  Book jbook = gson.fromJson(json, Book.class);
		  System.out.println(jbook.getIsbn());
		  System.out.println(jbook.getName());
		  System.out.println(jbook.getPrice());
		  System.out.println(jbook.getList());
	}

}
