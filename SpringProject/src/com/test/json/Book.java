package com.test.json;

import java.util.List;

public class Book {

	private String isbn;
	private String name;
	private int price;
	private List<String>list;
	
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
//	public Book(String _isbn,String _name,int _price){
//		isbn = _isbn;
//		name = _name;
//		price = _price;
//	}
	
}
