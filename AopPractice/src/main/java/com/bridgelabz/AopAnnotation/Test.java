package com.bridgelabz.AopAnnotation;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static Logger logger = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");
        logger.debug("...........");
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.m();  
        System.out.println("calling k...");  
        e.k(); 
	}

}
