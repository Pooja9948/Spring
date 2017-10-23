package com.bridgelabz.afterreturning;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static Logger logger = Logger.getLogger(Test1.class);
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
	        Operation1 e = (Operation1) context.getBean("opBean");  
	        logger.debug("...........");
	        System.out.println("calling m...");  
	        System.out.println(e.m());  
	        System.out.println("calling k...");  
	        System.out.println(e.k()); 
	}

}
