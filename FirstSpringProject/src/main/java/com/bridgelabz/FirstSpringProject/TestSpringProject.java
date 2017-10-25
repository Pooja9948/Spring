package com.bridgelabz.FirstSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant restaurant=(Restaurant)context.getBean("restaurantBean");
		//restaurant.setWecomeNote("object is setting wecome note property");
		restaurant.greetCustomer();
		/*Restaurant restaurant1=(Restaurant)context.getBean("restaurantBean");
		restaurant1.greetCustomer();*/
		//restaurant.prepareHotDrink();
	}
}
