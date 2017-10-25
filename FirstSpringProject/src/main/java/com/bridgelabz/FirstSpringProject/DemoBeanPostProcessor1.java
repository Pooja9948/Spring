package com.bridgelabz.FirstSpringProject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor1 implements BeanPostProcessor,Ordered{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("@@@@@@@>"+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("--------->"+arg1);
		return arg0;
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
