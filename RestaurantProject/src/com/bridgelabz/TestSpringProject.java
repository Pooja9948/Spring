package com.bridgelabz;

public class TestSpringProject {
	public static void main(String[] args){
		ApllicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurant=(Restaurant)context.getBean("restaurantBean");
		restaurant.greetCustomer();
	}
}
