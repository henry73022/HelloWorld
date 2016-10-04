package com.service;

public class UserService {

	private String name;
	public void sayHello() {		
		System.out.println(name);
	}
	
	public UserService(){
		System.out.println("¤wNEW¥XUserService!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
