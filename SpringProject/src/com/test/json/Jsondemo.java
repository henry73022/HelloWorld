package com.test.json;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;

public class Jsondemo {

	public static void main(String[] args) {
		
		  //======= Object to JSON =======
		  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		  //建立Book物件
//		  Book book = new Book("956-987236-1", "Java歷險記", 550);
		  Book book  = (Book) ac.getBean("book");
		  //建立GSON物件
		  Gson gson = new Gson();
		
		  //將Book物件轉成JSON
		  String json = gson.toJson(book);
		  //把JSON格式的資料秀出來
		  System.out.println(json);
		  //輸出結果：{"isbn":"956-987236-1","name":"Java歷險記","price":550}
		  //======== JSON to Object ========
		  //將JSON格式的資料轉成物件
		  Book jbook = gson.fromJson(json, Book.class);
		  System.out.println(jbook.getIsbn());
		  System.out.println(jbook.getName());
		  System.out.println(jbook.getPrice());
		  System.out.println(jbook.getList());
	}

}
