package com.bridgelabz.FirstSpringProject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	
	//FOR USING CONSTRUCTOR
	IHotDrink hotDrink;
	/*public Restaurant(IHotDrink hotDrink) {
		this.hotDrink=hotDrink;
		
	}*/
	//PROVIDING DI USING SETTERS METHOD
	/*public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}*/
	//FOR SETTERS METHOD
	String wecomeNote;
	
	public void setWecomeNote(String wecomeNote) {
		this.wecomeNote = wecomeNote;
	}

	public void greetCustomer(){
		System.out.println(wecomeNote);
	}
	/*public void greetCustomer(){
		System.out.println("welcome dear customer!!!");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("bean is going through init");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("bean is going through destroy");
	}*/
}
