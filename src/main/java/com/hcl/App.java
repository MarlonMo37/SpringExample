package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.config.AppConfig;
import com.hcl.model.Driver;
//import com.hcl.model.General;
//import com.hcl.model.Product;

/**
 * BeanFactory -> Root Interface for accesing a Spring Container This container
 * instantiates ,configures and manages number of beans These beans are
 * collobarate with one another and thus have dependencies between themselves
 * ApplicationContext sits on top of BeanFactory Interfaces BeanFactory provides
 * basic functionality for managing/mainpulating beans whereas
 * ApplicationContext provides some extra functionalitiy MessageSource,Access to
 * resources, Event Propogation,I18N
 */
public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		General g = (General) context.getBean("cons");
//		g.output();// masareti
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(AppConfig.class);
				Driver driver=(Driver)ctx1.getBean("driver");
				System.out.println(driver);
	}
}
